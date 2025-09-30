package platzi.play.util;

import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String captureText(String message) {
        System.out.println(message + ": ");
        return SCANNER.nextLine();
    }

    public static int captureNumber(String message) {
        System.out.println(message + ": ");

        while (!SCANNER.hasNextInt()) {
            System.out.println("Please enter a valid number");
            System.out.println(message + ": ");
            SCANNER.next();
        }

        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public static double captureDecimal(String message) {
        System.out.println(message + ": ");

        while (!SCANNER.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            System.out.println(message + ": ");
            SCANNER.next();
        }

        double number = SCANNER.nextDouble();
        SCANNER.nextLine();
        return number;
    }

}
