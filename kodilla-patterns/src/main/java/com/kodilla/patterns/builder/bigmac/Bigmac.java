package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    //roll
    public static final String WITH_SESAME = "Roll with sesame";
    public static final String WITHOUT_SESAME = "Roll without sesame";
    //burgers
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    //souce
    public static final String STANDARD = "Standard";
    public static final String THOUSAND_ISLANDS = "1000 Islands";
    public static final String BARBECUE = "Barbecue";
    //ingredients
    public static final String SALAD = "Salad";
    public static final String ONION = "Onion";
    public static final String BACON = "Bacon";
    public static final String CUCUMBER = "Cucumber";
    public static final String CHILLI_PEPPER = "Chilli pepper";
    public static final String MUSHROOMS = "Mushrooms";
    public static final String SHRIMP = "Shrimp";
    public static final String CHEESE = "Cheese";

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            if (roll.equals(WITH_SESAME) || roll.equals(WITHOUT_SESAME)) {
                this.roll = roll;
                return this;
            } else {
                throw new IllegalStateException("Illegal roll");
            }
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers >= MIN_INDEX && burgers <= MAX_INDEX) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("Illegal quantity of burgers");
            }
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLANDS) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Illegal sauce");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(ingredients.equals(SALAD) || ingredients.equals(ONION) || ingredients.equals(BACON) || ingredients.equals(CUCUMBER) || ingredients.equals(CHILLI_PEPPER) || ingredients.equals(MUSHROOMS) || ingredients.equals(SHRIMP) || ingredients.equals(CHEESE) ) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Illegal ingredients");
            }
        }

        public Bigmac build() {
            return new Bigmac(roll,burgers,sauce,ingredients);
        }

    }

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
