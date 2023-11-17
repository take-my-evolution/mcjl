package application;
import java.io.File;
import java.io.FilenameFilter;

public class FileSearch {

    public static File[] GetFiles(String folderPath, String extension) {
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
            File[] files = folder.listFiles(new ExtensionFilter(extension));
            if (files != null) {
                return files;
            }
        } else {
            return null;
        }
		return null;
    }

    static class ExtensionFilter implements FilenameFilter {
        private String extension;

        public ExtensionFilter(String extension) {
            this.extension = extension;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(extension);
        }
    }
}