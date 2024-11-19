public final class Settings {
    private static Settings instance;
    public String appName = "AppSingleton";
    public int theme = 1;

    private Settings(String appName, int appVersion) {
        this.appName = appName;
        this.theme = appVersion;
    }

    public  static Settings getInstance(String appName, int appVersion) {
        if (instance == null) {
            instance = new Settings(appName, appVersion);
        }
        return instance;
    }

    public void displaySettings() {
        System.out.println("Nome App: " + appName);
        System.out.println("Tema do App: " + theme);
    }
}
