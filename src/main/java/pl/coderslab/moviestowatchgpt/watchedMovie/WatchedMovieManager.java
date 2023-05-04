package pl.coderslab.moviestowatchgpt.watchedMovie;


import java.util.List;
import java.util.Optional;

public interface WatchedMovieManager {

    List<WatchedMovieSummary> getAll();

    Optional<WatchedMovieSummary> getByTitle(String title);

    WatchedMovieSummary update(UpdateWatchedMovieRequest request);

    WatchedMovieSummary create(CreateWatchedMovieRequest request);

}
