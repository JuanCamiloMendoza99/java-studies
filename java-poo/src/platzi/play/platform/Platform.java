package platzi.play.platform;

import platzi.play.content.Movie;
import platzi.play.content.Genre;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<String> getTitles() {
        return content.stream().map(Movie::getTitle).toList();
    }

    public void deleteContent(Movie movie) {
        this.content.remove(movie);
    }

    public Movie getMovieByName(String name) {
        return content.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Movie> getMoviesByGenre(Genre genre) {
        return content.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .toList();
    }

    public List<Movie> getPopularMovies(int max_movies) {
        return content.stream()
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                .filter(movie -> movie.getRating() >= 4)
                .limit(max_movies)
                .toList();
    }

    public int getTotalDuration() {
        return content.stream().mapToInt(Movie::getDuration).sum();
    }

    public Movie getLongestMovie() {
        return content.stream()
                .max(Comparator.comparingInt(Movie::getDuration))
                .orElse(null);
    }

    public Movie getShortestMovie() {
        return content.stream()
                .min(Comparator.comparingInt(Movie::getDuration))
                .orElse(null);
    }

    public String getName() {
        return name;
    }

    public List<Movie> getContent() {
        return content;
    }

}
