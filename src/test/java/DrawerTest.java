import machine.components.Drawer;
import machine.components.EnumCode;
import org.junit.Before;
import org.junit.Test;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Sweet sweet;

    @Before
    public void before(){
        drawer = new Drawer(EnumCode.A1, 0.65);
        sweet = new Sweet("Choquito","Lacta");
    }

    @Test
    public void hasEnumCode(){
        assertEquals (EnumCode.A1, drawer.getEnumCode());
    }

    @Test
    public void hasPrice(){
        assertEquals(0.65, drawer.getPrice(),0.00);
    }

    @Test
    public void hasName(){
        assertEquals("Choquito", sweet.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Lacta", sweet.getBrand());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0,drawer.itemCount());
    }

    @Test
    public void canAddItem(){
        drawer.addItem(sweet);
        assertEquals(1, drawer.itemCount());
    }

    @Test
    public void canVendItem(){
        drawer.addItem(sweet);
        Sweet sweet = (Sweet)drawer.vendProduct();
        assertEquals("Choquito", sweet.getName());
    }

}
