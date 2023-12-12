package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: RegularPricingStrategy.java
 * Description: This class is to set the regular price.
 */
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Pizza pizza) {
        return 20.0;
    }
}