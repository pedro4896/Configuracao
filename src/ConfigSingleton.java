import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigSingleton {

    private static ConfigSingleton instance;
    private ConfigFile config;

    private ConfigSingleton() {
        config = new ConfigFile();
        loadFile();
    }

    public static synchronized ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    private void loadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("config.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");

                if (parts.length == 2) {
                    applyConfig(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de configuração: " + e.getMessage());
        }
    }

    private void applyConfig(String key, String value) {
        switch (key) {
            case "AppId": config.setAppId(value); break;
            case "UserName": config.setUserName(value); break;
            case "Language": config.setLanguage(value); break;
            case "Offline": config.setOffline(Integer.parseInt(value)); break;
            case "AutoDLC": config.setAutoDLC(Integer.parseInt(value)); break;
            case "BuildId": config.setBuildId(value); break;
            case "DLCName": config.setDlcName(value); break;
            case "UpdateDB": config.setUpdateDB(Integer.parseInt(value)); break;
            case "Signature": config.setSignature(value); break;
            case "WindowInfo": config.setWindowInfo(value); break;
            case "LVWindowInfo": config.setLvWindowInfo(value); break;
            case "ApplicationPath": config.setApplicationPath(value); break;
            case "WorkingDirectory": config.setWorkingDirectory(value); break;
            case "WaitForExit": config.setWaitForExit(Integer.parseInt(value)); break;
            case "NoOperation": config.setNoOperation(Integer.parseInt(value)); break;
        }
    }

    public ConfigFile getConfig() {
        return config;
    }
}
