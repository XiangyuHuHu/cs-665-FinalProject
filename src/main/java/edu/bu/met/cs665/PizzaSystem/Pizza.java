package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: Pizza.java
 * Description: This class is main pizza class.
 */
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    public Pizza(PizzaBuilder builder) {
        this.dough = builder.getDough();
        this.sauce = builder.getSauce();
        this.cheese = builder.getCheese();
        this.toppings = builder.getToppings();
    }
    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }


    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, " + cheese + " cheese, toppings: " + toppings;
    }
}