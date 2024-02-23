package assigment.utils;

import java.util.Scanner;

public class ScannerUtils {
    public int inputInt(String errorMessage) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a integer number");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public float inputFloat(String errorMessage) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a float number");
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public double inputDouble(String errorMessage) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a double number");
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        return scanner.nextLine();
    }
}
