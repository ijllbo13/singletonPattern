package mx.iteso.tablesTest;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 10/22/2016.
 */
public class Table3Test {
    TableOrder tableOrder;

    @Before
    public void setUp(){
        Table3.clearOrder();
        tableOrder = Table3.getInstance();
    }

    @Test
    public void tableCheckTest(){
        tableOrder.printCheck();
    }

    @Test
    public void tableDishTest(){
        tableOrder.addDish(new Dish());
        assertEquals(1, tableOrder.dishes.size());
    }

    @Test
    public void tableDrinkTest(){
        tableOrder.addDrink(new Drink());
        assertEquals(1, tableOrder.drinks.size());
        tableOrder.clearDrinks();
        assertEquals(0, tableOrder.drinks.size());
    }
}
