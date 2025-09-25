package platzi.play;

import java.time.LocalDate;
import java.time.LocalDateTime;

import platzi.play.content.Movie;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;

public class Main {
    public static void main(String[] args) {

        String name = ScannerUtils.captureText("Name of the movie");
        String genre = ScannerUtils.captureText("Genre of the movie");
        int duration = ScannerUtils.captureNumber("Duration in minutes");
        double rating = ScannerUtils.captureDecimal("Rate the movie (0 to 5)");

        Movie movie = new Movie();
        movie.title = name;
        movie.description = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.";
        movie.duration = duration;
        movie.genre = genre;
        movie.releaseDate = LocalDate.of(2010, 7, 16);
        movie.rate(rating);
        movie.isAvailable = true;

        System.out.println(movie.getInformation());

        User user = new User();
        user.name = "Juan Mendoza";
        user.registrationDate = LocalDateTime.now();

    }
}
