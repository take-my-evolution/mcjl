import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class launch {

    private static final String FILE_PATH = "launch.env";

    public static void main(String[] args) {

        File file = new File(FILE_PATH);
        if (file.exists()) {
            checkFileContents(file);
        } else {
            createFile(file);
        }
    }

    private static void checkFileContents(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String javaPath = null;
            String memory = null;
            String user = null;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    if (key.equals("java_path")) {
                        javaPath = value;
                    } else if (key.equals("memory")) {
                        memory = value;
                    } else if (key.equals("user")) {
                        user = value;
                    }
                }
            }

            if (isValidJavaPath(javaPath) && isValidMemory(memory) && isValidUser(user)) {
                displayVariables(javaPath, memory, user);
            } else {
                promptForVariables(file);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValidJavaPath(String javaPath) {
        if (javaPath == null) {
            return false;
        }
        File file = new File(javaPath);
        return file.exists();
    }

    private static boolean isValidMemory(String memory) {
        try {
            int value = Integer.parseInt(memory);
            return value >= 4 && value <= 64;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidUser(String user) {
        return !user.isEmpty();
    }

    private static void displayVariables(String javaPath, String memory, String user) {
        System.out.println("java_path: " + javaPath);
        System.out.println("memory: " + memory);
        System.out.println("user: " + user);
    }

    private static void promptForVariables(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            Scanner scanner = new Scanner(System.in);
            String javaPath = "";
            while (!isValidJavaPath(javaPath)) {
                System.out.print("Enter java_path: ");
                javaPath = scanner.nextLine();
                if (!isValidJavaPath(javaPath)) {
                    System.out.println("Invalid java_path. Please enter a valid path.");
                }
            }
            writer.write("java_path=" + javaPath + "\n");
            String memory = "";
            while (!isValidMemory(memory)) {
                System.out.print("Enter memory (4-64): ");
                memory = scanner.nextLine();
                if (!isValidMemory(memory)) {
                    System.out.println("Invalid memory. Please enter a value between 4 and 64.");
                }
            }
            writer.write("memory=" + memory + "\n");
            String user = "";
            while (!isValidUser(user)) {
                System.out.print("Enter user: ");
                user = scanner.nextLine();
                if (!isValidUser(user)) {
                    System.out.println("Invalid user. Please enter a non-empty value.");
                }
            }
            writer.write("user=" + user + "\n");
            writer.close();
            scanner.close();
            displayVariables(javaPath, memory, user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                promptForVariables(file);
            } else {
                System.out.println("Failed to create file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
