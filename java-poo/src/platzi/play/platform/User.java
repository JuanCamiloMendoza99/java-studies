package platzi.play.platform;

import java.time.LocalDateTime;

import platzi.play.content.Movie;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean isActive;
    private LocalDateTime registrationDate;

    public User(String name) {
        this.name = name;
        this.isActive = true;
        this.registrationDate = LocalDateTime.now();
    }

    public void seeMovie(Movie movie) {
        System.out.println(name + " is watching ");
        movie.play();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return isActive;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvailable(boolean isActive) {
        this.isActive = isActive;
    }

}
