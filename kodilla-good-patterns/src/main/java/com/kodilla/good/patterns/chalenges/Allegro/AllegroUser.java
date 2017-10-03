package com.kodilla.good.patterns.chalenges.Allegro;

public final class AllegroUser {
    private String name;
    private String email;

    public AllegroUser(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
