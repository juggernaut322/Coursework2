public class SettingsManager {
    private static SettingsManager instance;

    private SettingsManager() {
        // Private constructor to prevent instantiation
    }

    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }

    // Methods to manage settings (e.g., default note settings, application preferences)
}
