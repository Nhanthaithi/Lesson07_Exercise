package assigment.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllformedLocaleException;
import java.util.List;

public class FileManager {
    private static final String FILE_NOT_FOUND_ERROR = "Error! File Not Exist.";
    private static final String FILE_DELETION_ERROR = "Error deleting file.";
    private static final String IO_ERROR = "Input/Output error.";
    private static final String FILE_EXISTS_ERROR = "Error! File Exist.";
    private static final String PATH_FILE_NULL = "Error! Path can not null.";

    public static boolean isFileExists(String pathFile) throws IllformedLocaleException {
        if (pathFile == null || pathFile.trim().isEmpty()) {
            throw new IllegalArgumentException("Đường dẫn không được null hoặc rỗng.");
        }

        File file = new File(pathFile);
        return file.exists();
    }

    public static void createFile(String pathFIle) throws IOException, IllegalArgumentException {
        if (pathFIle == null || pathFIle.trim().isEmpty()) {
            throw new IllegalArgumentException("Đường dẫn không được null hoặc rỗng.");
        }

        File file = new File(pathFIle);

        if (file.exists()) {
            throw new IOException(FILE_EXISTS_ERROR);
        }
        if (!file.createNewFile()) {
            throw new IOException("Error creating new file.");
        }
    }

    public static void createFile(String path, String fileName) throws IOException, IllegalArgumentException {

        if (path == null || path.trim().isEmpty()) {
            throw new IllegalArgumentException("Đường dẫn không được null hoặc rỗng.");
        }

        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, fileName);

        createFile(file.getAbsolutePath());
    }

    public static void removeFile(String pathFile) throws IOException, IllegalArgumentException {
        if (pathFile == null || pathFile.trim().isEmpty()) {
            throw new IllegalArgumentException("Đường dẫn không được null hoặc rỗng.");
        }
        File file = new File(pathFile);

        if (!isFileExists(pathFile)) {
            throw new IOException(FILE_NOT_FOUND_ERROR);
        }
        if (!file.delete()) {
            throw new IOException(FILE_DELETION_ERROR);
        }
    }

    public static boolean isFolder(String path) throws IllegalArgumentException{
        if (path == null || path.trim().isEmpty()) {
            throw new IllegalArgumentException("Đường dẫn không được null hoặc rỗng.");
        }

        File file = new File(path);

        return file.exists() && file.isDirectory();
    }

    public static List<String> getAllFileName(String path) throws IOException {
        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IOException("Error! Path is not folder.");
        }

        List<String> fileNames = new ArrayList<>();
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }
        return fileNames;
    }
}
