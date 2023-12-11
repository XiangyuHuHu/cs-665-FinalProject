package edu.bu.met.cs665.PizzaSystem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a builder for Italian Pizza
        PizzaBuilder builder = new ItalianPizzaBuilder();


        // Get user input for pizza customization
        System.out.print("Enter dough type (e.g., Whole Wheat, Thin Crust): ");
        String dough = scanner.nextLine();
        builder.dough(dough);

        System.out.print("Enter sauce type (e.g., Pesto, Marinara): ");
        String sauce = scanner.nextLine();
        builder.sauce(sauce);

        System.out.print("Enter cheese type (e.g., Goat Cheese, Mozzarella): ");
        String cheese = scanner.nextLine();
        builder.cheese(cheese);

        // Get multiple toppings
        System.out.println("Enter toppings (type 'done' to finish): ");
        List<String> toppings = new ArrayList<>();
        while (true) {
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("done")) {
                break;
            }
            toppings.add(topping);
        }

        // Using varargs to add toppings
        builder.toppings(toppings.toArray(new String[0]));

        // Build the pizza
        Pizza pizza = builder.build();
        System.out.println("Ordered Pizza: " + pizza);

        // Create a pizza order
        PizzaOrder order = new PizzaOrder();

        // Attach an observer for customer notifications
        System.out.print("Please enter your name for order notifications: ");
        String customerName = scanner.nextLine();

        // Create an observer for customer notifications
        CustomerNotificationService notificationService = new CustomerNotificationService(customerName);

        order.attach(notificationService);

        // Update order status to notify the customer
        order.setStatus("Preparing");
        // Simulate a delay or waiting period
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
        order.setStatus("Ready for Pickup");

        // Determine if it's happy hour
        LocalTime now = LocalTime.now();
        LocalTime happyHourStart = LocalTime.of(15, 0); // Example: 3 PM
        LocalTime happyHourEnd = LocalTime.of(18, 0); // Example: 6 PM
        boolean isHappyHour = now.isAfter(happyHourStart) && now.isBefore(happyHourEnd);

        // Apply appropriate pricing strategy
        PricingStrategy pricingStrategy;
        if (isHappyHour) {
            System.out.println("Happy Hour! Enjoy discounted prices.");
            pricingStrategy = new HappyHourPricingStrategy();
        } else {
            pricingStrategy = new RegularPricingStrategy();
        }

        double price = pricingStrategy.calculatePrice(pizza);
        System.out.println("Total Price: $" + price);

        // Rest of the demo code for Observer and Strategy Patterns...
        // Close the scanner
        scanner.close();
    }
}
