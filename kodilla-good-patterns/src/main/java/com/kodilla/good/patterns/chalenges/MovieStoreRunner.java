package com.kodilla.good.patterns.chalenges;

import java.util.List;
import java.util.Map;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .forEach(s -> System.out.print(s + " ! "));
    }
}

