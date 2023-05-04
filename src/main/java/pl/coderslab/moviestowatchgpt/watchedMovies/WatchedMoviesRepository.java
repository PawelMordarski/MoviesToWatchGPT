package pl.coderslab.moviestowatchgpt.watchedMovies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchedMoviesRepository extends JpaRepository<WatchedMovies, Long> {


}
