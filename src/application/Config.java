package application;

import java.io.*;
import java.io.Serializable;

public class Config implements Serializable {
    private static final long serialVersionUID = 1L;
    
	private String java_path;
    private int memory;
    private String user;

    public Config(){
        this.java_path = "";
        this.memory = 0;
        this.user = "";
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

    public static Config deserialize(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Config config = (Config) objectInputStream.readObject();
            return config;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}