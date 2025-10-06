package platzi.play.exception;

public class ExistingMovieException extends RuntimeException {
    public ExistingMovieException(String title) {
        super("The movie with title '" + title + "' already exists in the platform.");
    }
}
