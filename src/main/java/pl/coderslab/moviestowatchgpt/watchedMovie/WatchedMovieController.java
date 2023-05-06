package pl.coderslab.moviestowatchgpt.watchedMovie;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("api/watchedmovies")
@Slf4j
@RequiredArgsConstructor
public class WatchedMovieController {

    private final WatchedMovieManager watchedMovieManager;

    @PostMapping
    public ResponseEntity<?> createWatchedMovie(@RequestBody @Valid CreateWatchedMovieRequest request) {
        WatchedMovieSummary summary = watchedMovieManager.create(request);
        return ResponseEntity.created(URI.create("/api/watchedmovies/" + summary.title())).build();
    }


}
