package edu.bu.met.cs665.PizzaSystem;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/12/2023
 * File Name: PizzaOrder.java
 * Description: This class is pizza order status.
 */
import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }

    public String getStatus() {
        return status;
    }
}

