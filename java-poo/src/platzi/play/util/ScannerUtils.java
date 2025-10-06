package platzi.play.util;

import java.util.Scanner;

import platzi.play.content.Genre;
import platzi.play.content.Language;
import platzi.play.content.Quality;

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

    public static Genre captureGenre(String message) {
        System.out.println(message + ": ");

        for (Genre genre : Genre.values()) {
            System.out.println("- " + genre.name());
        }

        while (true) {
            try {
                return Genre.valueOf(SCANNER.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid genre");
                System.out.println(message + ": ");
            }
        }
    }

    public static Language captureLanguage(String message) {
        System.out.println(message + ": ");

        for (Language language : Language.values()) {
            System.out.println("- " + language.name());
        }

        while (true) {
            try {
                return Language.valueOf(SCANNER.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid language");
                System.out.println(message + ": ");
            }
        }
    }

    public static Quality captureQuality(String message) {
        System.out.println(message + ": ");

        for (Quality quality : Quality.values()) {
            System.out.println("- " + quality.name());
        }

        while (true) {
            try {
                return Quality.valueOf(SCANNER.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid quality");
                System.out.println(message + ": ");
            }
        }
    }

}
