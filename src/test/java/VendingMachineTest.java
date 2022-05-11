import coins.Coin;
import coins.CoinType;
import machine.components.CoinReturn;
import machine.components.Drawer;
import machine.components.EnumCode;
import machine.components.VendingMachine;
import org.junit.Before;
import products.Sweet;

import java.util.ArrayList;

import static com.sun.tools.classfile.Attribute.Code;

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



}
