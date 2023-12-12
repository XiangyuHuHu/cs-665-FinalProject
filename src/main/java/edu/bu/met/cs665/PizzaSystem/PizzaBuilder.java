package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: PizzaBuilder.java
 * Description: This class is main pizza builder.
 */
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