package org.example;

public enum DcMovies {
    JUSTICE_LEAGUE_SNYDERCUT(10),
    AQUAMAN(6),
    DARK_KNIGHT(8),
    MAN_OF_STEEL(7),
    WONDER_WOMAN(6),
    SHAZAM(5);

    final int movieRating;

    DcMovies (int movieRating){
        this.movieRating = movieRating;
    }
}
