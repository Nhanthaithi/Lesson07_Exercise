package assigment.utils;

import assigment.entities.MyException;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;

public class LogsUtils {
    public static void writeLog(String message, String reason, StackTraceElement[] stackTrace, LocalDate time) throws IOException {
        MyException exception = new MyException(message, reason, stackTrace, time);
        writeLog(exception);
    }

    public static void writeLog(MyException exception) throws IOException {
        String filePath = "files/Exception.ser";

        if (!FileManager.isFileExists(filePath)) {
            FileManager.createFile(filePath);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(exception);
        }
    }

    public static void readExceptionFile(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {

            MyException exception = (MyException) ois.readObject();
            System.out.println("Message: " + exception.getMessage());
            System.out.println("Reason: " + exception.getReason());
            System.out.println("Time: " + exception.getTime());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
    }
}
