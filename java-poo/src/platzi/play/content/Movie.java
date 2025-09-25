package platzi.play.content;

import java.time.LocalDate;

public class Movie {
    public String title;
    public String description;
    public int duration;
    public String genre;
    public double rating;
    public boolean isAvailable;
    public LocalDate releaseDate;

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
            System.out.println("New rating for " + title + ": " + rating);
        } else {
            System.out.println("Rating must be between 0 and 5.");
        }
    }

    public boolean isPopular() {
        return this.rating >= 4;
    }

}
