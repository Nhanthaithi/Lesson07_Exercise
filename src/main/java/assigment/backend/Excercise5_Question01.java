package assigment.backend;

import assigment.entities.Student;
import assigment.utils.FileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excercise5_Question01 {
    // Khởi tạo 3 student
    private List<Student> students = new ArrayList<>();

    public void Question01() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Khởi tạo sinh viên thứ : " + i);
            Student student = new Student();
            students.add(student);
        }
        // Ghi thông tin vào file StudentInformation.txt
        // DÙng file Writer

        String filePath = "files/StudentInformation.txt";
        try {
            if (!FileManager.isFileExists(filePath)) {
                FileManager.createFile(filePath);
            }

            try (FileWriter writer = new FileWriter("files/StudentInformation.txt", true)) {
                int numberStudent = 1;
                for (Student student : students) {
                    String studentInfo = String.format("Student %d:\nId: %d\nHọ và tên: %s\n\n", numberStudent, student.getId(), student.getName());
                    writer.write(studentInfo);
                    numberStudent++;
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file = " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("files/StudentInformation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file = " + e.getMessage());
        }
    }


}
