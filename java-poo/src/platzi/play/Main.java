package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.Platform;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

public class Main {

    public static final String APP_NAME = "Platzi Play";

    public static final int ADD_MOVIE_OPTION = 1;
    public static final int SHOW_MOVIES_OPTION = 2;
    public static final int SEARCH_MOVIE_OPTION = 3;
    public static final int DELETE_MOVIE_OPTION = 4;
    public static final int EXIT_OPTION = 5;

    public static void main(String[] args) {

        Platform platform = new Platform(APP_NAME);

        while (true) {

            int option = ScannerUtils.captureNumber("""
                    Choose an option:
                        1. Add movie
                        2. Show movies
                        3. Search movie by name
                        4. Delete movie
                        5. Exit
                    """);

            System.out.println("Option: " + option);

            switch (option) {
                case ADD_MOVIE_OPTION -> {
                    String name = ScannerUtils.captureText("Name of the movie");
                    String genre = ScannerUtils.captureText("Genre of the movie");
                    int duration = ScannerUtils.captureNumber("Duration in minutes");
                    double rating = ScannerUtils.captureDecimal("Rate the movie (0 to 5)");
                    platform.addContent(new Movie(name, duration, genre, rating));
                }
                case SHOW_MOVIES_OPTION -> platform.showTitleMovies();

                case SEARCH_MOVIE_OPTION -> {
                    System.out.println("Search movie by name");
                }

                case DELETE_MOVIE_OPTION -> {
                    System.out.println("Delete movie by name");
                }
                case EXIT_OPTION -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid option");
            }

        }

    }
}
