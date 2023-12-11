package edu.bu.met.cs665.PizzaSystem;

public class HappyHourPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Pizza pizza) {
        return 15.0;
    }
}