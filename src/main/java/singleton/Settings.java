package singleton;

public class Settings {
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
        static {
            System.out.println("3. SettingsHolder static initialized");
        }
    }

    public static Settings getInstance() {
        System.out.println("2. getInstance is called");
        return SettingsHolder.INSTANCE;
    }
}
