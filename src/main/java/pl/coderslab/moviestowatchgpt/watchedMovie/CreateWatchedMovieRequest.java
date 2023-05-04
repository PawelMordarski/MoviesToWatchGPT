package pl.coderslab.moviestowatchgpt.watchedMovie;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public record CreateWatchedMovieRequest (
    @NotBlank String title,
    @NotBlank Date date,
    @Range(min = 1L, max = 10L) Integer rate) {}