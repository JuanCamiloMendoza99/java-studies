package platzi.play;

import platzi.play.content.Movie;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

public class Main {
    public static void main(String[] args) {

        String name = ScannerUtils.captureText("Name of the movie");
        String genre = ScannerUtils.captureText("Genre of the movie");
        int duration = ScannerUtils.captureNumber("Duration in minutes");
        double rating = ScannerUtils.captureDecimal("Rate the movie (0 to 5)");

        Movie movie = new Movie(name, duration, genre, rating);

        System.out.println(movie.getInformation());

        User user = new User("Juan Mendoza");
        user.seeMovie(movie);

    }
}
