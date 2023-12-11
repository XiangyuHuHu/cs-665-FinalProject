package edu.bu.met.cs665.PizzaSystem;

public class CustomerNotificationService implements OrderObserver {
    private String name;

    public CustomerNotificationService(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Notification for " + name + ": Your pizza order is " + status);
    }
}