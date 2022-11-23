package org.example;

import static java.time.chrono.JapaneseEra.values;

public class Main {
    public static void main(String[] args) {
        DcMovies dcMovies = DcMovies.DARK_KNIGHT;

        if (dcMovies == DcMovies.DARK_KNIGHT){
            System.out.println("Amazing Trilogy");
        }

        for (DcMovies new52 :DcMovies.values()){
            System.out.println(new52);
        }
        System.out.println("Movie rating is:" +DcMovies.SHAZAM.movieRating);
    }
}