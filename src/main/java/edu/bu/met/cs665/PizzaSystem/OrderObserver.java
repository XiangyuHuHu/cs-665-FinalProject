package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: OrderObserver.java
 * Description: This class is the observer pattern.
 */
public interface OrderObserver {
    void update(String status);
}