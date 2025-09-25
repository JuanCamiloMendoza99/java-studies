package platzi.play;

import java.util.Scanner;

import platzi.play.content.Movie;
import platzi.play.platform.User;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.title = "Inception";
        movie.description = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.";
        movie.duration = 148;
        movie.genre = "Science Fiction";
        movie.yearRelease = 2010;
        movie.rate(4.5);
        movie.isAvailable = true;

        User user = new User();
        user.name = "Juan Mendoza";

        user.seeMovie(movie);

        // System.out.println("Hello World");

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What's your name?");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name);

    }
}
