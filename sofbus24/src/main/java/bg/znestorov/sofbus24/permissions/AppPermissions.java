package bg.znestorov.sofbus24.permissions;

public enum AppPermissions {

    LOCATION(
            android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION);

    private final String[] permissions;

    AppPermissions(String... permissions) {
        this.permissions = permissions;
    }

    public String[] getPermissions() {
        return permissions;
    }
}
