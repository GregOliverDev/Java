public class Main {
    public static void main(String[] args) {
        Settings settingsVersion1 = Settings.getInstance("AppSingleton", 1);
        Settings settingsVersion1Duplicate = Settings.getInstance("DifferentName", 2);

        System.out.println("Versão 1");
        settingsVersion1.displaySettings();

        System.out.println("\nVersão Duplicada");
        settingsVersion1Duplicate.displaySettings();
    }
}