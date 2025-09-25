package platzi.play.platform;

import java.time.LocalDateTime;

import platzi.play.content.Movie;

public class User {
    public String name;
    public String email;
    public String password;
    public boolean isActive;
    public LocalDateTime registrationDate;

    public void seeMovie(Movie movie) {
        System.out.println(name + " is watching ");
        movie.play();
    }

}
