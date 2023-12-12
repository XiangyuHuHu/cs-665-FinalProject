package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: PricingStrategy.java
 * Description: This class is strategy pattern.
 */
public interface PricingStrategy {
    double calculatePrice(Pizza pizza);
}
