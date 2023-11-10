package application;

import java.io.File;

public class FolderCreator {

    public static void create(String name) throws Exception {
        String folderPath = name;

            File folder = new File(folderPath);

            if (!folder.exists()) {
                boolean success = folder.mkdir(); 
                if (!success) {
                    throw new Exception("Не удалось создать папку.");
                }
            } else {
                throw new Exception("Папка уже существует.");
            }
    }
}