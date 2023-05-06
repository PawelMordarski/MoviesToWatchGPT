package pl.coderslab.moviestowatchgpt.watchedMovie;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public record UpdateWatchedMovieRequest(
        @NotBlank String title,
//        @NotBlank Date date,
        @Range(min = 1L, max = 10L) Integer rate,
        @Size(max = 1000) String comment) {
}
