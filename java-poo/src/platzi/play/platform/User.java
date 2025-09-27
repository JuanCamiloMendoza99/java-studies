package platzi.play.platform;

import java.time.LocalDateTime;

import platzi.play.content.Movie;

public class User {
    public String name;
    public String email;
    public String password;
    public boolean isActive;
    public LocalDateTime registrationDate;

    public User(String name) {
        this.name = name;
        this.isActive = true;
        this.registrationDate = LocalDateTime.now();
    }

    public void seeMovie(Movie movie) {
        System.out.println(name + " is watching ");
        movie.play();
    }

}
