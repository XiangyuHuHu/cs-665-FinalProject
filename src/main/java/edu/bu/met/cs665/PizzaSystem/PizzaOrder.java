package edu.bu.met.cs665.PizzaSystem;

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

