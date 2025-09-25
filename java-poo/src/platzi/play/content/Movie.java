package platzi.play.content;

public class Movie {
    public String title;
    public String description;
    public int duration;
    public String genre;
    public int yearRelease;
    public double rating;
    public boolean isAvailable;

    public void play() {
        System.out.println("Playing movie: " + title);
    }

    public String getInformation() {
        return "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Duration: " + duration + " minutes\n" +
                "Genre: " + genre + "\n" +
                "Year of Release: " + yearRelease + "\n" +
                "Rating: " + rating + "\n" +
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
