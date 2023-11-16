package application;

public class Instance {
    private String instanceName;
    private Config config;

    public Instance(String name) {
        instanceName = name;
        config = new Config(); // Create a new instance of Config
    }

    public String getInstanceName() {
        return instanceName;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}