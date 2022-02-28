package bg.znestorov.sofbus24.permissions;

public enum AppPermissions {

    HOME_SCREEN(
            // Network connectivity permissions
            android.Manifest.permission.ACCESS_NETWORK_STATE,
            android.Manifest.permission.INTERNET,
            // Current device location
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION
    ),

    EXTERNAL_STORAGE(
            // Read/write from external storage
            android.Manifest.permission.READ_EXTERNAL_STORAGE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
    );

    private final String[] permissions;

    AppPermissions(String... permissions) {
        this.permissions = permissions;
    }

    public String[] getPermissions() {
        return permissions;
    }
}
