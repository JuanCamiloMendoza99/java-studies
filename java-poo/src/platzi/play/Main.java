package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.Platform;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

public class Main {

    public static final String APP_NAME = "Platzi Play";

    public static void main(String[] args) {

        Platform platform = new Platform(APP_NAME);

        String name = ScannerUtils.captureText("Name of the movie");
        String genre = ScannerUtils.captureText("Genre of the movie");
        int duration = ScannerUtils.captureNumber("Duration in minutes");
        double rating = ScannerUtils.captureDecimal("Rate the movie (0 to 5)");

        Movie movie = new Movie(name, duration, genre, rating);
        Movie anotherMovie = new Movie("The Lion King", 120, "Animation", 4.5);

        platform.addContent(movie);
        platform.addContent(anotherMovie);

        platform.showTitleMovies();

        User user = new User("Juan Mendoza");
        user.seeMovie(movie);

    }
}
