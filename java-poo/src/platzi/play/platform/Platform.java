package platzi.play.platform;

import platzi.play.content.Movie;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private String name;
    private List<Movie> content;

    public Platform(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void addContent(Movie movie) {
        this.content.add(movie);
    }

    public void showTitleMovies() {
        for (Movie movie : content) {
            System.out.println(movie.getTitle());
        }
    }

    public void deleteContent(Movie movie) {
        this.content.remove(movie);
    }

    public Movie getMovieByName(String name) {
        for (Movie movie : content) {
            if (movie.getTitle().equalsIgnoreCase(name)) {
                return movie;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getContent() {
        return content;
    }

}
