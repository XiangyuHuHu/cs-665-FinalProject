package edu.bu.met.cs665;
import edu.bu.met.cs665.PizzaSystem.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPizza {

    @Test
    public void testBuildPizza() {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.dough("Thin Crust").sauce("Marinara").cheese("Mozzarella").toppings("Olives", "Peppers").build();

        assertNotNull(pizza);
        assertEquals("Thin Crust", pizza.getDough());
        assertEquals("Marinara", pizza.getSauce());
        assertEquals("Mozzarella", pizza.getCheese());
        assertTrue(pizza.getToppings().contains("Olives"));
        assertTrue(pizza.getToppings().contains("Peppers"));
    }
    @Test
    public void testPizzaToppings() {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.toppings("Mushrooms", "Olives").build();

        assertTrue(pizza.getToppings().contains("Mushrooms"));
        assertTrue(pizza.getToppings().contains("Olives"));
        assertEquals(2, pizza.getToppings().size());
    }
    @Test
    public void testOrderStatusUpdate() {
        PizzaOrder order = new PizzaOrder();
        order.setStatus("Baking");
        assertEquals("Baking", order.getStatus()); // Assuming getStatus() method exists
    }
    @Test
    public void testPizzaDough() {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.dough("Whole Wheat").build();

        assertEquals("Whole Wheat", pizza.getDough());
    }
    @Test
    public void testRegularPricing() {
        PricingStrategy strategy = new RegularPricingStrategy();
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.build(); // Assuming a default pizza for testing

        double price = strategy.calculatePrice(pizza);
        assertEquals(20.0, price, 0.01); // Assuming 20.0 is the expected regular price
    }
    @Test
    public void testRegularPricingStrategy() {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.dough("Thin Crust").sauce("Marinara").cheese("Mozzarella").toppings("Olives", "Peppers").build();

        PricingStrategy strategy = new RegularPricingStrategy();
        double price = strategy.calculatePrice(pizza);
        assertEquals(20.0, price, 0.01);
    }

    @Test
    public void testHappyHourPricingStrategy() {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        Pizza pizza = builder.dough("Thin Crust").sauce("Marinara").cheese("Mozzarella").toppings("Olives", "Peppers").build();

        PricingStrategy strategy = new HappyHourPricingStrategy();
        double price = strategy.calculatePrice(pizza);
        assertEquals(15.0, price, 0.01);
    }
}
