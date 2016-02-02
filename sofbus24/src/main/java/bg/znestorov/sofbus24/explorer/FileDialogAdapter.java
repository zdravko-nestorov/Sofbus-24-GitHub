package bg.znestorov.sofbus24.explorer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Array Adapter used to set each row of the file manager
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class FileDialogAdapter extends ArrayAdapter<File> {

    private final Activity context;
    private final ArrayList<File> filesList;

    public FileDialogAdapter(Activity context, ArrayList<File> filesList) {
        super(context, R.layout.file_explorer_list_item, filesList);
        this.context = context;
        this.filesList = filesList;
    }

    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        final ViewHolder viewHolder;

        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.file_explorer_list_item, null);

            viewHolder = new ViewHolder();
            viewHolder.fileTypeImage = (ImageView) rowView.findViewById(R.id.file_explorer_file_type);
            viewHolder.fileName = (TextView) rowView.findViewById(R.id.file_explorer_file_name);
            viewHolder.fileSize = (TextView) rowView.findViewById(R.id.file_explorer_file_size);

            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        File file = filesList.get(position);
        setFileTypeImage(viewHolder, file);
        viewHolder.fileName.setText(file.getName());
        setFileSize(viewHolder, file);

        return rowView;
    }

    /**
     * Set the appropriate icon for each file/folder
     *
     * @param viewHolder the viewHolder containing the elements from the layout
     * @param file       the current file
     */
    private void setFileTypeImage(ViewHolder viewHolder, File file) {
        if (file.isFile()) {
            viewHolder.fileTypeImage.setImageResource(R.drawable.icn_file);
        } else {
            viewHolder.fileTypeImage.setImageResource(R.drawable.icn_folder);
        }
    }

    /**
     * Set the file size of each file. In case the element is a folder - show nothing
     *
     * @param viewHolder the viewHolder containing the elements from the layout
     * @param file       the current file
     */
    private void setFileSize(ViewHolder viewHolder, File file) {
        if (file.isFile()) {
            viewHolder.fileSize.setVisibility(View.VISIBLE);
            viewHolder.fileSize.setText(calculateFileSize(file));
        } else {
            if (!"..".equals(file.getName())) {
                viewHolder.fileSize.setVisibility(View.VISIBLE);
                viewHolder.fileSize.setText(calculateFilesCount(file));
            } else {
                viewHolder.fileSize.setVisibility(View.GONE);
                viewHolder.fileSize.setText("");
            }
        }
    }

    /**
     * Calculate the size of the file
     *
     * @param file the current file
     * @return the size of the file
     */
    private String calculateFileSize(File file) {
        long fileSize = file.length();
        BigDecimal formattedFileSize;

        if (fileSize < 1024) {
            formattedFileSize = new BigDecimal(fileSize).setScale(2, BigDecimal.ROUND_HALF_UP);
            return context.getString(R.string.file_explorer_b, formattedFileSize);
        } else if (fileSize < 1024 * 1024) {
            formattedFileSize = new BigDecimal((double) fileSize / 1024).setScale(2, BigDecimal.ROUND_HALF_UP);
            return context.getString(R.string.file_explorer_kb, formattedFileSize);
        } else if (fileSize < 1024 * 1024 * 1024) {
            formattedFileSize = new BigDecimal((double) fileSize / (1024 * 1024)).setScale(2, BigDecimal.ROUND_HALF_UP);
            return context.getString(R.string.file_explorer_mb, formattedFileSize);
        } else {
            formattedFileSize = new BigDecimal((double) fileSize / (1024 * 1024 * 1024)).setScale(2, BigDecimal.ROUND_HALF_UP);
            return context.getString(R.string.file_explorer_gb, formattedFileSize);

        }
    }

    /**
     * Calculates the count of the files in the current folder
     *
     * @param file the current file
     * @return the count of the files in the current folder
     */
    private String calculateFilesCount(File file) {
        String result;
        int filesCount = getBackupFilesInDirectory(file);

        switch (filesCount) {
            case 1:
                result = context.getString(R.string.file_explorer_file);
                break;
            default:
                result = context.getString(R.string.file_explorer_files, filesCount);
                break;
        }

        return result;
    }

    /**
     * Get the folders/files in the current folder. This method counts
     * only the files that are Sofbus 24 backup files/
     *
     * @param file the current file
     * @return the count of the files in the current folder
     */
    private int getBackupFilesInDirectory(File file) {

        // Check if the file is existing or is not a directory or contains no files
        if (file == null || !file.exists() || !file.isDirectory() || file.listFiles() == null) {
            return 0;
        }

        File[] childFiles = file.listFiles();
        int filesCount = 0;

        // Do not count system directories/files and all other that are not Sofbus 24 backup files
        for (File child : childFiles) {

            String childName = Utils.getFilenameFromPath(child.getName());
            if (!childName.startsWith(".") && (child.isDirectory() || childName.endsWith(Constants.GLOBAL_PARAM_BACKUP_EXTENSION))) {
                filesCount++;
            }
        }

        return filesCount;
    }

    static class ViewHolder {
        ImageView fileTypeImage;
        TextView fileName;
        TextView fileSize;
    }

}