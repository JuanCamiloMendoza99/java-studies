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
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        return number;
    }

    public static double captureDecimal(String message) {
        System.out.println(message + ": ");
        double number = SCANNER.nextDouble();
        SCANNER.nextLine();
        return number;
    }

}
