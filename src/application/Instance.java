package application;

import java.io.*;
import java.util.UUID;

public class Instance implements Serializable {
    private static final long serialVersionUID = 2L;
    private UUID uuid;
    
    private String instance_name;
	private String java_path;
	private String server;
	private String arguments;
    private int memory;
    private String user;

  
    public Instance(String name){
    	instance_name = name;
    	this.java_path = System.getProperty("java.home");
    	this.arguments = "";
    	this.server = "";
        this.memory = 4096;
        this.user = "Mr.WierdGreenCat";
        
        uuid = UUID.randomUUID();
    }
    
    public String getUUID()
    {
    	return uuid.toString();
    }
    
    public String getVersion()
    {
    	return String.valueOf(serialVersionUID);
    }
    
    public String getJavaPath() {
        return java_path;
    }

    public void setJavaPath(String java_path) {
        this.java_path = java_path;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public void serialize(String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Object saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to save object to " + filePath);
        }
    }

    public static Instance deserialize(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
        	Instance config = (Instance) objectInputStream.readObject();
            return config;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString()
    {
    	return instance_name;
    }
    
    private String config_folder_path = "configs"; //TODO В двух местах одинаково ето ПЛОХО
    
    
    public void Delete() {
    	File[] files = FileSearch.GetFiles(config_folder_path, ".conf");
    	
		for (File file : files) {
			if (file.getName().equals(getUUID().toString() + ".conf"))
				file.delete();
		}
    }
    	
    
}