package pl.coderslab.moviestowatchgpt.watchedMovie;

import java.util.Date;

public record WatchedMovieSummary(
        String title,
//        Date date,
        Integer rate,
        String comment) {}
