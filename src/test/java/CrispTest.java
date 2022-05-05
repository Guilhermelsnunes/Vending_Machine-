import org.junit.Before;
import org.junit.Test;
import products.Crisps;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    Crisps crisps;

    @Before
    public void before(){
        crisps = new Crisps("Crisps", "Walkers", "Cheese and Onion");
    }


    @Test
    public void hasName(){
        assertEquals("Crisps", crisps.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Walkers", crisps.getBrand());
    }

    @Test
    public void hasFlavour(){
        assertEquals("Cheese and Onion", crisps.getFlavour());
    }
}
