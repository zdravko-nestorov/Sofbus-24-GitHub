package bg.znestorov.sofbus24.backup;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import java.io.File;
import java.io.IOException;
import java.util.List;

import bg.znestorov.sofbus24.utils.Utils;

/**
 * The method in the class are used to save/load the user information in case of reinstall the application, delete the data and etc.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class BackupData {

    private static final String SOFBUS_24_PATH = "//data//data//bg.znestorov.sofbus24.main//";
    private static final String SOFBUS_24_PATH_BACKUP = "//data//data//bg.znestorov.sofbus24.main.backup//";

    private static final String SOFBUS_24_PACKAGE_FOLDER_NAME = "bg.znestorov.sofbus24.main";
    private static final String SOFBUS_24_DB_FOLDER_NAME = "databases";
    private static final String SOFBUS_24_DB_FILE = "sofbus24.db";
    private static final String SOFBUS_24_DB_JOURNAL_FILE = "sofbus24.db-journal";

    private static final String SOFBUS_24_BACKUP_PASSWORD = "U09GQlVTXzI0X0JBQ0tVUF9QQVNTV09SRF9aRFJBVktPX05FU1RPUk9W";

    /**
     * Export the Sofbus 24 data to a zip file, encrypted with a password. The data contains all user data
     * (favourites, settings and etc) except the stations database
     *
     * @param targetLocation this is the location, where the encrypted zip file will be stored.
     *                       The param should contain the path, the name of the zip file and its extension
     * @return if the export of the data is successful or not
     */

    public static boolean exportSofbus24Data(String targetLocation) {

        boolean exportResult = true;
        try {
            new File(targetLocation).delete();
            createPasswordProtectedZipFile(SOFBUS_24_PATH, targetLocation);
        } catch (Exception e) {
            exportResult = false;
        }

        return exportResult;
    }

    /**
     * Import the Sofbus 24 data from a zip file, encrypted with a password. The data contains all user data
     * (favourites, settings and etc) except the stations database
     *
     * @param sourceLocation this is the location, where the encrypted zip file is stored.
     *                       The param should contain the path, the name of the zip file and its extension
     * @return if the import of the data is successful or not
     */
    public static boolean importSofbus24Data(String sourceLocation) {

        boolean importResult = true;
        try {
            copyPasswordProtectedZipFileContent(sourceLocation, SOFBUS_24_PATH);
        } catch (Exception e) {
            importResult = false;
        }

        return importResult;
    }

    /**
     * Create password protected zip file (zip entire directory)
     *
     * @param sourceLocation the source file/directory location (will be zipped)
     * @param targetLocation the target location (location of the zip file)
     * @throws ZipException signals that a Zip exception of some sort has occurred.
     */
    private static void createPasswordProtectedZipFile(String sourceLocation, String targetLocation) throws ZipException {

        // Create ZipParameters and configure them
        ZipParameters zipParameters = new ZipParameters();
        zipParameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        zipParameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        zipParameters.setEncryptFiles(true);
        zipParameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
        zipParameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
        zipParameters.setPassword(SOFBUS_24_BACKUP_PASSWORD);

        // Create the ZIP file
        ZipFile zipFile = new ZipFile(targetLocation);
        zipFile.addFolder(sourceLocation, zipParameters);

        // Remove the stations database from the ZIP file
        removeZipEntryFile(zipFile, SOFBUS_24_DB_FILE);
        removeZipEntryFile(zipFile, SOFBUS_24_DB_JOURNAL_FILE);
    }

    /**
     * Remove a ZipEntry from a ZipFile using its name
     *
     * @param zipFile           the current zip file
     * @param zipFileHeaderName the name of the ZipEntry that will be deleted
     * @throws ZipException
     */
    private static void removeZipEntryFile(ZipFile zipFile, String zipFileHeaderName) throws ZipException {

        FileHeader zipFileHeader = null;
        List zipFileHeaders = zipFile.getFileHeaders();

        // Look for the "zipFileHeaderName" (sofbus24.db or sofbus24.db-journal)
        for (int i = 0; i < zipFileHeaders.size(); i++) {
            FileHeader currentZipFileHeader = (FileHeader) zipFileHeaders.get(i);
            String currentZipFileHeaderName = currentZipFileHeader.getFileName();

            // Check if the file header for "zipFileHeaderName" file is found
            if (currentZipFileHeaderName.endsWith(zipFileHeaderName)) {
                zipFileHeader = currentZipFileHeader;
                break;
            }
        }

        // Remove the "zipFileHeaderName" file from the ZIP file (sofbus24.db or sofbus24.db-journal)
        if (zipFileHeader != null) {
            zipFile.removeFile(zipFileHeader);
        }
    }

    /**
     * Extract the password protected file to the same directory, copies the current DB files, delete the current user configuration and
     * replace it with the one from the file
     *
     * @param sourceLocation the source file/directory location (the location of the zip file)
     * @param targetLocation the target location (location to unzip the file)
     * @throws ZipException
     * @throws IOException
     */
    private static void copyPasswordProtectedZipFileContent(String sourceLocation, String targetLocation) throws Exception {

        // Get the location path of the ZipFile and the name of the folder after extracting the ZipFile
        String sourceLocationPath = Utils.getParentPathFromPath(sourceLocation);
        String newlySourceLocationPath = sourceLocationPath + SOFBUS_24_PACKAGE_FOLDER_NAME + File.separator;

        try {
            // Unzip the ZipFile with the backup to the same folder
            unzipPasswordProtectedZipFile(sourceLocation, sourceLocationPath);

            // Get the newly created directory (after extracting the ZipFile) and copy the current DB files into it
            copyCurrentDb(newlySourceLocationPath, SOFBUS_24_DB_FILE);
            copyCurrentDb(newlySourceLocationPath, SOFBUS_24_DB_JOURNAL_FILE);

            // Copy the newly created directory (after extracting the ZipFile) with the current DBs into the Android data folder
            Utils.copyAndReplaceFileOrDirectory(newlySourceLocationPath, SOFBUS_24_PATH);

        } finally {
            // Delete the newly created directory (located in the same directory as the ZipFile)
            Utils.deleteFileOrDirectory(newlySourceLocationPath);
        }
    }

    private static boolean renameBackupFolder() {
        return new File(SOFBUS_24_PATH_BACKUP).renameTo(new File(SOFBUS_24_PATH));
    }

    /**
     * Copy the current DB files to a some location
     *
     * @param sourceLocation the source file/directory location
     * @param dbFilename     the name of the DB file
     * @throws IOException
     */
    private static void copyCurrentDb(String sourceLocation, String dbFilename) throws IOException {

        String sofbus24SourceDbFilePath = SOFBUS_24_PATH + SOFBUS_24_DB_FOLDER_NAME + File.separator + dbFilename;
        String sofbus24TargetDbFilePath = sourceLocation + SOFBUS_24_DB_FOLDER_NAME + File.separator + dbFilename;

        Utils.copyAndReplaceFileOrDirectory(sofbus24SourceDbFilePath, sofbus24TargetDbFilePath);
    }

    /**
     * Unzip password protected zip file
     *
     * @param sourceLocation the source file/directory location (the location of the zip file)
     * @param targetLocation the target location (location to unzip the file)
     * @throws ZipException signals that a Zip exception of some sort has occurred.
     */
    private static void unzipPasswordProtectedZipFile(String sourceLocation, String targetLocation) throws ZipException {

        ZipFile zipFile = new ZipFile(sourceLocation);

        // Check if the file was encrypted. If so - decrypt it using using password
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(SOFBUS_24_BACKUP_PASSWORD);
        }

        // Extract the ZIP file
        zipFile.extractAll(targetLocation);
    }

}