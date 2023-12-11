package edu.bu.met.cs665.PizzaSystem;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Pizza pizza) {
        return 20.0;
    }
}