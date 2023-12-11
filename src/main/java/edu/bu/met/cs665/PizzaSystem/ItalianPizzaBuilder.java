package edu.bu.met.cs665.PizzaSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItalianPizzaBuilder implements PizzaBuilder {
    private String dough = "Thin Crust";
    private String sauce = "Marinara";
    private String cheese = "Mozzarella";
    private List<String> toppings = new ArrayList<>();


    @Override
    public String getDough() {
        return dough;
    }

    @Override
    public String getSauce() {
        return sauce;
    }

    @Override
    public String getCheese() {
        return cheese;
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public ItalianPizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public ItalianPizzaBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public ItalianPizzaBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;

    }


    @Override
    public ItalianPizzaBuilder toppings(String... toppings) {
        this.toppings = new ArrayList<>(Arrays.asList(toppings)); // Convert varargs to List
        return this;
    }


    @Override
    public Pizza build() {
        if (dough == null && sauce == null && cheese == null && toppings == null) {
            throw new IllegalStateException("Missing required pizza ingredients");
        }
        return new Pizza(this);
    }


}