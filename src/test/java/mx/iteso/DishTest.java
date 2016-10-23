package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 10/22/2016.
 */
public class DishTest {
    Dish dish1 = new Dish();

    @Before
    public void setUp(){
        dish1.setName("Spagz");
        dish1.setDescription("Spaghetti dish with tomato...");
        dish1.setPrice(14);
        dish1.setWaiter("Waiter A");
    }

    @Test
    public void dishTest(){
        assertEquals("Spagz", dish1.getName());
        assertEquals("Spaghetti dish with tomato...", dish1.getDescription());
        assertEquals((14), dish1.getPrice(), 0.01);
        assertEquals("Waiter A", dish1.getWaiter());
    }



}
