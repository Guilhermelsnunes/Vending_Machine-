import org.junit.Before;
import org.junit.Test;
import products.Drink;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before
    public void before(){
        drink = new Drink ("Coke", "Coca-Cola");
    }

    @Test
    public void hasName(){
        assertEquals("Coke", drink.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Coca-Cola", drink.getBrand());
    }

}
