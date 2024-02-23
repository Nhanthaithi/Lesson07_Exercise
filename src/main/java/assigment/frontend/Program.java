package assigment.frontend;

import assigment.utils.FileManager;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try {
            FileManager.createFile("files", "test.txt");
            System.out.println("Create file Successfully");
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }

        try {
            FileManager.removeFile("files/test.txt");
            System.out.println("Deleted file Successfully");
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }

    }
}
