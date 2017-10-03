package com.kodilla.good.patterns.chalenges.Allegro;

public final class Product {
    private final String name;
    private final String prize;

    public Product(final String name, final String prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public String getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return name + " w cenie = " + prize;
    }
}
