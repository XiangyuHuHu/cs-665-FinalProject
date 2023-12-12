package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: HappyHourPricingStrategy.java
 * Description: This class is to set happy hour price.
 */

public class HappyHourPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Pizza pizza) {
        return 15.0;
    }
}