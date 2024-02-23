package assigment.entities;


import assigment.utils.ScannerUtils;

import java.io.Serializable;

public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Student() {

        ScannerUtils scannerUtils = new ScannerUtils();

        System.out.println("Enter student ID");
        this.id = scannerUtils.inputInt("Invalid number");
        this.name = scannerUtils.inputString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
