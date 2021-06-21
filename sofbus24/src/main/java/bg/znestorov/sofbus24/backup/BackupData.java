package bg.znestorov.sofbus24.backup;

import android.app.Activity;
import android.util.Base64;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.utils.Utils;

/**
 * The method in the class are used to save/load the user information in case of reinstall the application, delete the data and etc.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class BackupData {

    /**
     * Locations of the files that MUST be excluded when making the backup:
     * -> "/data/data/bg.znestorov.sofbus24.main/databases"
     * -> "/data/data/bg.znestorov.sofbus24.main/databases/sofbus24.db"
     * -> "/data/data/bg.znestorov.sofbus24.main/databases/sofbus24.db-journal"
     * -> "/data/data/bg.znestorov.sofbus24.main/databases/google_analytics_v4.db"
     * -> "/data/data/bg.znestorov.sofbus24.main/databases/google_analytics_v4.db-journal"
     * -> "/data/data/bg.znestorov.sofbus24.main/shared_prefs/application_gcm.xml"
     * -> "/data/data/bg.znestorov.sofbus24.main/files/gaClientId"
     */
    private static final String SOFBUS_24_DB_FOLDER_NAME = "databases";
    private static final String SOFBUS_24_DB_FILE = "sofbus24.db";
    private static final String SOFBUS_24_DB_JOURNAL_FILE = "sofbus24.db-journal";
    private static final String SOFBUS_24_DB_GA_FILE = "google_analytics_v4.db";
    private static final String SOFBUS_24_DB_GA_JOURNAL_FILE = "google_analytics_v4.db-journal";
    private static final String SOFBUS_24_PREF_GCM_FILE = "application_gcm.xml";
    private static final String SOFBUS_24_FILES_GA_CLIENT_FILE = "gaClientId";
    private static final char[] SOFBUS_24_BACKUP_PASSWORD = "U09GQlVTXzI0X0JBQ0tVUF9QQVNTV09SRF9aRFJBVktPX05FU1RPUk9W".toCharArray();
    private final String sofbus24Path;
    private final String sofbus24PackageFolderName;

    public BackupData(Activity context) {
        this.sofbus24Path = context.getFilesDir().getParent() + File.separator;
        this.sofbus24PackageFolderName = context.getPackageName();
    }

    /**
     * Export the Sofbus 24 data to a zip file, encrypted with a password. The data contains all user data
     * (favourites, settings and etc) except the stations database
     *
     * @param targetLocation this is the location, where the encrypted zip file will be stored.
     *                       The param should contain the path, the name of the zip file and its extension
     * @return if the export of the data is successful or not
     */
    public boolean exportSofbus24Data(String targetLocation) {

        boolean exportResult = true;
        try {
            new File(targetLocation).delete();
            createPasswordProtectedZipFile(sofbus24Path, targetLocation);
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
    public boolean importSofbus24Data(String sourceLocation) {

        boolean importResult = true;
        try {
            copyPasswordProtectedZipFileContent(sourceLocation, sofbus24Path);
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
    private void createPasswordProtectedZipFile(String sourceLocation, String targetLocation) throws Exception {

        // Create ZipParameters and configure them
        ZipParameters zipParameters = new ZipParameters();
        zipParameters.setCompressionMethod(CompressionMethod.DEFLATE);
        zipParameters.setCompressionLevel(CompressionLevel.NORMAL);
        zipParameters.setEncryptFiles(true);
        zipParameters.setEncryptionMethod(EncryptionMethod.AES);
        zipParameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);

        // Create the ZIP file
        ZipFile zipFile = new ZipFile(targetLocation);
        zipFile.setPassword(SOFBUS_24_BACKUP_PASSWORD);
        List<File> sourceLocationChildrenFiles = getChildrenFolders(sourceLocation);

        // This case should never been reached, because the source folder is created
        // when the application is installed (/data/data/bg.znestorov.sofbus24.main/)
        if (sourceLocationChildrenFiles.isEmpty()) {
            throw new Exception("The Sofbus 24 data folder doesn't exist. It seems that this is a major installation bug.");
        }

        // Add all not-empty folders located in the application data folder into the ZipFile
        for (File child : sourceLocationChildrenFiles) {
            zipFile.addFolder(child, zipParameters);
        }

        // Remove the stations database from the ZIP file
        removeZipEntryFile(zipFile, SOFBUS_24_DB_FILE);
        removeZipEntryFile(zipFile, SOFBUS_24_DB_JOURNAL_FILE);

        // Remove the GoogleAnalytics database from the ZIP file
        removeZipEntryFile(zipFile, SOFBUS_24_DB_GA_FILE);
        removeZipEntryFile(zipFile, SOFBUS_24_DB_GA_JOURNAL_FILE);

        // Remove the GCM file, which contains the GCM ID and some other specific user information
        removeZipEntryFile(zipFile, SOFBUS_24_PREF_GCM_FILE);
        removeZipEntryFile(zipFile, SOFBUS_24_FILES_GA_CLIENT_FILE);

        // Create the Backup file as a Base64-encoded ZipFile
        createBase64File(targetLocation);
    }

    /**
     * Get the children files located in the fileLocation. All files that don't exist
     * (system files) or can't be read are excluded
     *
     * @param fileLocation the source file/directory location (will be zipped)
     * @return a list with all children files that can be copied
     */
    private List<File> getChildrenFolders(String fileLocation) {

        List<File> sofbus24DataFolders = new ArrayList<File>();

        // Check if the source location is not empty
        if (Utils.isEmpty(fileLocation)) {
            return sofbus24DataFolders;
        }

        // Check if the file from this source location exists
        File sourceFile = new File(fileLocation);
        if (!sourceFile.exists()) {
            return sofbus24DataFolders;
        }

        // Check if the source location contains any files or folders inside
        File[] sourceFileChildrenArray = sourceFile.listFiles();
        if (sourceFileChildrenArray == null || sourceFileChildrenArray.length == 0) {
            return sofbus24DataFolders;
        }

        // Iterate over all children of the source location and get only the existing ones, which are not empty.
        // It is possible that the array contains files that do not exists - they are system files.
        // For example: "/data/data/bg.znestorov.sofbus24.main/lib"
        for (File child : sourceFileChildrenArray) {
            if (child.exists() && child.canRead() && child.isDirectory() && child.listFiles() != null && child.listFiles().length > 0) {
                sofbus24DataFolders.add(child);
            }
        }

        return sofbus24DataFolders;
    }

    /**
     * Remove a ZipEntry from a ZipFile using its name
     *
     * @param zipFile           the current zip file
     * @param zipFileHeaderName the name of the ZipEntry that will be deleted
     * @throws ZipException
     */
    private void removeZipEntryFile(ZipFile zipFile, String zipFileHeaderName) throws ZipException {

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
     * Creates a Base64-encoded file using the data from the ZipFile
     *
     * @param zipSourceLocation the source file/directory location (the location of the zip file)
     * @throws IOException
     */
    private void createBase64File(String zipSourceLocation) throws Exception {

        try {
            // Base64-encode the ZipFile and return a newly allocated byte[] with the result
            byte[] zipFileInBase64 = Base64.encode(Utils.getBytesFromFile(zipSourceLocation), Base64.DEFAULT);

            // Overwrite the ZipFile with the Base64 encoded data
            Utils.writeBytesToFile(zipSourceLocation, zipFileInBase64);
        } catch (IOException e) {
            // Delete the ZipFile (in this case a strange error occurred while converting the file to Base64)
            Utils.deleteFileOrDirectory(zipSourceLocation);
        }
    }

    /**
     * Extract the password protected file to the same directory, copies the current DB files, delete the current user configuration and
     * replace it with the one from the file
     *
     * @param backupSourceLocation the source file/directory location (the location of the backup file)
     * @param targetLocation       the target location (location to unzip the file)
     * @throws ZipException
     * @throws IOException
     */
    private void copyPasswordProtectedZipFileContent(String backupSourceLocation, String targetLocation) throws Exception {

        // Get the location path of the ZipFile and the name of the folder after extracting the ZipFile
        String zipSourceLocation = backupSourceLocation + "_TEMP";
        String zipExtractLocation = Utils.getParentPathFromPath(backupSourceLocation) + sofbus24PackageFolderName + File.separator;

        try {
            // Unzip the ZipFile with the backup to the same folder
            createZipFileFromBase64(backupSourceLocation, zipSourceLocation);
            unzipPasswordProtectedZipFile(zipSourceLocation, zipExtractLocation);

            // Get the newly created directory (after extracting the ZipFile) and copy the current DB files into it
            copyCurrentDb(zipExtractLocation, SOFBUS_24_DB_FILE);
            copyCurrentDb(zipExtractLocation, SOFBUS_24_DB_JOURNAL_FILE);

            // Copy the newly created directory (after extracting the ZipFile) with the current DBs into the Android data folder
            Utils.copyAndReplaceFileOrDirectory(zipExtractLocation, sofbus24Path);

        } finally {
            // Delete the newly created ZipFile (located in the same directory as the Backup)
            Utils.deleteFileOrDirectory(zipSourceLocation);

            // Delete the newly created directory (located in the same directory as the Backup)
            Utils.deleteFileOrDirectory(zipExtractLocation);
        }
    }

    /**
     * Creates a ZipFile from the Backup Base64-encoded file
     *
     * @param backupSourceLocation the source file/directory location (the location of the backup file)
     * @throws IOException
     */
    private void createZipFileFromBase64(String backupSourceLocation, String zipSourceLocation) throws Exception {

        byte[] zipFileInBase64 = Utils.getBytesFromFile(backupSourceLocation);
        byte[] zipFileBytes = Base64.decode(zipFileInBase64, Base64.DEFAULT);
        Utils.writeBytesToFile(zipSourceLocation, zipFileBytes);
    }

    /**
     * Unzip password protected zip file
     *
     * @param zipSourceLocation the source file/directory location (the location of the zip file)
     * @param targetLocation    the target location (location to unzip the file)
     * @throws ZipException signals that a Zip exception of some sort has occurred.
     */
    private void unzipPasswordProtectedZipFile(String zipSourceLocation, String targetLocation) throws ZipException {

        ZipFile zipFile = new ZipFile(zipSourceLocation);

        // Check if the file was encrypted. If so - decrypt it using using password
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(SOFBUS_24_BACKUP_PASSWORD);
        }

        // Extract the ZIP file
        zipFile.extractAll(targetLocation);
    }

    /**
     * Copy the current DB files to a some location
     *
     * @param sourceLocation the source file/directory location
     * @param dbFilename     the name of the DB file
     * @throws IOException
     */
    private void copyCurrentDb(String sourceLocation, String dbFilename) throws IOException {

        String sofbus24SourceDbFilePath = sofbus24Path + SOFBUS_24_DB_FOLDER_NAME + File.separator + dbFilename;
        String sofbus24TargetDbFilePath = sourceLocation + SOFBUS_24_DB_FOLDER_NAME + File.separator + dbFilename;

        Utils.copyAndReplaceFileOrDirectory(sofbus24SourceDbFilePath, sofbus24TargetDbFilePath);
    }

}