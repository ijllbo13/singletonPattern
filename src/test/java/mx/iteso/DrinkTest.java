package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 10/22/2016.
 */
public class DrinkTest {

    Drink drink = new Drink();

    @Before
    public void setUp() {
        drink.setName("Mojito");
        drink.setDescription("Fancy mojito drink...");
        drink.setPrice(7);
        drink.setWaiter("Waiter B");
    }

    @Test
    public void dishTest() {
        assertEquals("Mojito", drink.getName());
        assertEquals("Fancy mojito drink...", drink.getDescription());
        assertEquals((7), drink.getPrice(), 0.01);
        assertEquals("Waiter B", drink.getWaiter());
    }
}
