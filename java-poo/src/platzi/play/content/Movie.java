package platzi.play.content;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String description;
    private int duration;
    private String genre;
    private double rating;
    private boolean isAvailable;
    private LocalDate releaseDate;

    public Movie(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.isAvailable = true;
        this.releaseDate = LocalDate.now();
    }

    public Movie(String title, int duration, String genre, double rating) {
        this(title, duration, genre);
        this.rate(rating);
    }

    public void play() {
        System.out.println("Playing movie: " + title);
    }

    public String getInformation() {
        return "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Duration: " + duration + " minutes\n" +
                "Genre: " + genre + "\n" +
                "Year of Release: " + releaseDate.getYear() + "\n" +
                "Rating: " + rating + "/5" + "\n" +
                "Available: " + (isAvailable ? "Yes" : "No");
    }

    public void rate(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = newRating;
        } else {
            System.out.println("Rating must be between 0 and 5.");
        }
    }

    public boolean isPopular() {
        return this.rating >= 4;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
