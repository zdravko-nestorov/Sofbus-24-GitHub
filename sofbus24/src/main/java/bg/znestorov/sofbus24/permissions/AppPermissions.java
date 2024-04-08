package bg.znestorov.sofbus24.permissions;

import android.os.Build;

public enum AppPermissions {

    HOME_SCREEN(
            // Network connectivity permissions
            android.Manifest.permission.ACCESS_NETWORK_STATE,
            android.Manifest.permission.INTERNET,
            // Current device location
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION
    ),

    EXTERNAL_STORAGE_32_AND_BELOW(
            // Read/write from external storage
            android.Manifest.permission.READ_EXTERNAL_STORAGE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
    ),

    EXTERNAL_STORAGE_33_AND_ABOVE(
            // Read/write from external storage
    );

    private final String[] permissions;

    AppPermissions(String... permissions) {
        this.permissions = permissions;
    }

    public static AppPermissions getStoragePermissions() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
                ? EXTERNAL_STORAGE_32_AND_BELOW
                : EXTERNAL_STORAGE_33_AND_ABOVE;
    }

    public String[] getPermissions() {
        return permissions;
    }
}
