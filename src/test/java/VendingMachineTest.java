import coins.Coin;
import coins.CoinType;
import machine.components.CoinReturn;
import machine.components.Drawer;
import machine.components.EnumCode;
import machine.components.VendingMachine;
import org.junit.Before;
import org.junit.Test;
import products.Sweet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

//import static com.sun.tools.classfile.Attribute.Code;

public class VendingMachineTest {

    Coin onePence;
    Coin twoPence;
    Coin tenPence;
    Coin fivePence;
    Coin fiftyPence;
    Drawer drawer;
    CoinReturn coinReturn;
    VendingMachine machine;
    Sweet sweet;

    @Before
    public void before(){
        onePence = new Coin(CoinType.ONEPENCE);
        twoPence = new Coin(CoinType.TWOPENCE);
        tenPence = new Coin(CoinType.TENPENCE);
        fivePence = new Coin(CoinType.FIVEPENCE);
        fiftyPence = new Coin(CoinType.FIFTYPENCE);
        drawer = new Drawer(EnumCode.A1, 0.50);
        sweet = new Sweet("Choquito", "Lacta");
        drawer.addItem(sweet);
        ArrayList<Drawer> drawers = new ArrayList<>();
        drawers.add(drawer);
        coinReturn = new CoinReturn();
        machine = new VendingMachine(drawers, coinReturn);
    }

    @Test
    public void canAcceptCoins(){
        machine.addCoin(tenPence);
        assertEquals(0.10, machine.getCredit(), 0.01);
    }

    @Test
    public void cannotAcceptInvalidCoins(){
        machine.addCoin(onePence);
        machine.addCoin(twoPence);
        assertEquals(0.0, machine.getCredit(),0.01);
        assertEquals(0.03,machine.getCoinReturn().getValueOfCoins(),0.01);
    }

    @Test
    public void invalidCoinReturn(){
        machine.addCoin(onePence);
        assertEquals(0.01,machine.getCoinReturn().getValueOfCoins(),0.01);
    }

    @Test
    public void canBuyProduct(){
        machine.addCoin(fiftyPence);
        Sweet product = (Sweet)machine.vend(EnumCode.A1);
        assertEquals("Choquito", product.getName());
        assertEquals(0.00, machine.getCredit(),0.01);
    }








}
