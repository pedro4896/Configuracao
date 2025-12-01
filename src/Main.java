public class Main {
    public static void main(String[] args) {

        ConfigSingleton cfg = ConfigSingleton.getInstance();
        ConfigFile file = cfg.getConfig();

        System.out.println("--- CONFIGURAÇÕES CARREGADAS ---");
        System.out.println("AppId: " + file.getAppId());
        System.out.println("UserName: " + file.getUserName());
        System.out.println("Language: " + file.getLanguage());
        System.out.println("Offline: " + file.getOffline());
        System.out.println("AutoDLC: " + file.getAutoDLC());
        System.out.println("BuildId: " + file.getBuildId());
        System.out.println("DLCName: " + file.getDlcName());
        System.out.println("UpdateDB: " + file.getUpdateDB());
        System.out.println("Signature: " + file.getSignature());
        System.out.println("WindowInfo: " + file.getWindowInfo());
        System.out.println("LVWindowInfo: " + file.getLvWindowInfo());
        System.out.println("ApplicationPath: " + file.getApplicationPath());
        System.out.println("WorkingDirectory: " + file.getWorkingDirectory());
        System.out.println("WaitForExit: " + file.getWaitForExit());
        System.out.println("NoOperation: " + file.getNoOperation());
    }
}
