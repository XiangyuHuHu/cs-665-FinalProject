package edu.bu.met.cs665.PizzaSystem;

import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder dough(String dough);
    PizzaBuilder sauce(String sauce);
    PizzaBuilder cheese(String cheese);
    PizzaBuilder toppings(String... toppings);
    Pizza build();
    String getDough();
    String getSauce();
    String getCheese();
    List<String> getToppings();
}