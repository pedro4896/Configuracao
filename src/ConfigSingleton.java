public class ConfigSingleton {

    private static ConfigSingleton instance;
    private ConfigFile config;

    private ConfigSingleton() {
        config = new ConfigFile();
    }

    public static synchronized ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    public ConfigFile getConfig() {
        return config;
    }
}
