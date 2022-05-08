import org.junit.Before;
import org.junit.Test;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet ("Sonho de Valsa", "Garoto");
    }

    @Test
    public void hasName(){
        assertEquals("Sonho de Valsa", sweet.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Garoto", sweet.getBrand());
    }

}
