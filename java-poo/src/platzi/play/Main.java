package platzi.play;

import java.util.List;

import platzi.play.content.Genre;
import platzi.play.content.Language;
import platzi.play.content.Quality;
import platzi.play.content.SummaryContent;
import platzi.play.content.Movie;
import platzi.play.platform.Platform;
import platzi.play.platform.User;
import platzi.play.util.ScannerUtils;
import platzi.play.exception.ExistingMovieException;

public class Main {

    public static final String APP_NAME = "Platzi Play";

    public static final int ADD_MOVIE_OPTION = 1;
    public static final int SHOW_MOVIES_OPTION = 2;
    public static final int SEARCH_MOVIE_BY_NAME_OPTION = 3;
    public static final int SEARCH_MOVIE_BY_GENRE_OPTION = 4;
    public static final int GET_MOVIES_ORDERED_BY_RATING = 5;
    public static final int DELETE_MOVIE_OPTION = 6;
    public static final int EXIT_OPTION = 7;

    public static void main(String[] args) {

        Platform platform = new Platform(APP_NAME);
        loadMovies(platform);

        while (true) {

            int option = ScannerUtils.captureNumber("""
                    Choose an option:
                        1. Add movie
                        2. Show movies
                        3. Search movie by name
                        4. Search movies by genre
                        5. Get movies ordered by rating
                        6. Delete movie
                        7. Exit
                    """);

            switch (option) {
                case ADD_MOVIE_OPTION -> {
                    String name = ScannerUtils.captureText("Name of the movie");
                    Genre genre = ScannerUtils.captureGenre("Genre of the movie");
                    int duration = ScannerUtils.captureNumber("Duration in minutes");
                    double rating = ScannerUtils.captureDecimal("Rate the movie (0 to 5)");
                    Language language = ScannerUtils.captureLanguage("Language of the movie");
                    Quality quality = ScannerUtils.captureQuality("Quality of the movie");

                    try {
                        platform.addContent(new Movie(name, duration, genre, rating, language, quality));
                    } catch (ExistingMovieException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case SHOW_MOVIES_OPTION -> {
                    List<SummaryContent> titles = platform.getSummaries();
                    titles.forEach(System.out::println);
                }

                case SEARCH_MOVIE_BY_NAME_OPTION -> {
                    String name = ScannerUtils.captureText("Enter the movie name to search");
                    Movie movie = platform.getMovieByName(name);
                    if (movie != null) {
                        System.out.println(movie.getInformation());
                        movie.play();
                    } else {
                        System.out.println(name + " not found in the platform " + platform.getName());
                    }
                }

                case SEARCH_MOVIE_BY_GENRE_OPTION -> {
                    Genre genre = ScannerUtils.captureGenre("Enter the movie genre to search");
                    platform.getMoviesByGenre(genre).forEach(movie -> {
                        System.out.println(movie.getInformation() + "\n");
                        movie.play();
                    });
                }

                case GET_MOVIES_ORDERED_BY_RATING -> {
                    int max_movies = ScannerUtils.captureNumber("How many top rated movies do you want to see?");

                    platform.getPopularMovies(max_movies).forEach(movie -> {
                        System.out.println(movie.getInformation() + "\n");
                    });
                }

                case DELETE_MOVIE_OPTION -> {
                    String name = ScannerUtils.captureText("Enter the movie name to search");
                    Movie movie = platform.getMovieByName(name);
                    if (movie != null) {
                        platform.deleteContent(movie);
                        System.out.println(name + " has been removed from the platform " + platform.getName());
                    } else {
                        System.out.println(name + " not found in the platform " + platform.getName());
                    }
                }

                case EXIT_OPTION -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid option");
            }

        }

    }

    private static void loadMovies(Platform platform) {
        platform.addContent(new Movie("Shrek", 90, Genre.ANIMATION, 4.8, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("Inception", 148, Genre.SCI_FI, 4.9, Language.ENGLISH, Quality.FULL_HD));
        platform.addContent(new Movie("Titanic", 195, Genre.DRAMA, 4.6, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("John Wick", 101, Genre.ACTION, 4.5, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("The Conjuring", 112, Genre.HORROR, 3.0, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("Coco", 105, Genre.ANIMATION, 4.7, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("Interstellar", 169, Genre.SCI_FI, 5, Language.ENGLISH, Quality.UHD_4K));
        platform.addContent(new Movie("Joker", 122, Genre.DRAMA, 4.0, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("Toy Story", 81, Genre.ANIMATION, 4.5, Language.ENGLISH, Quality.HD));
        platform.addContent(new Movie("Avengers: Endgame", 181, Genre.ACTION, 3.9, Language.ENGLISH, Quality.HD));
    }

}
