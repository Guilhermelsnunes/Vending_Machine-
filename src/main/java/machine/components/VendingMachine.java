package machine.components;

import coins.Coin;
import coins.CoinType;
import products.Product;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private double credit;
    private CoinReturn coinReturn;


    public VendingMachine(ArrayList<Drawer> drawers, CoinReturn coinReturn) {
        this.drawers = drawers;
        this.credit = 0.0;
        this.coinReturn = coinReturn;
    }


    // get coin value and add
    public void addCoin(Coin coin) {
        if (checkCoinValid(coin)) {
            this.credit += coin.getValue();
        } else {
            this.coinReturn.addCoin(coin);
        }
    }

    //reject small coins
    private boolean checkCoinValid(Coin coin) {
        return coin.getType() != CoinType.ONEPENCE && coin.getType() != CoinType.TWOPENCE;
    }


    // getters
    public double getCredit() {
        return credit;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }


    // sale!
    public Product vend(EnumCode enumCode) {
        for (Drawer drawer : this.drawers) {
            if (enumCode == drawer.getEnumCode() && this.credit >= drawer.getPrice()) {
                this.credit = 0.0;
                return drawer.vendProduct();
            }
        }
        return null;
    }


    public Drawer getDrawer(EnumCode enumCode) {
        for (Drawer drawer : this.drawers) {
            if (drawer.getEnumCode() == enumCode) {
                return drawer;
            }
        }
        return null;
    }


    public void returnChange() {
        while (credit > 1.00) {
            this.coinReturn.addCoin(new Coin(CoinType.ONEPOUND));
            this.credit -= 1.0;
        }
        while (credit >= 0.5) {
            this.coinReturn.addCoin(new Coin(CoinType.FIFTYPENCE));
            this.credit -= 0.5;
        }

        while (credit >= 0.2) {
            this.coinReturn.addCoin(new Coin(CoinType.TWENTYPENCE));
            this.credit -= 0.2;
        }

        while (credit >= 0.1) {
            this.coinReturn.addCoin(new Coin(CoinType.TENPENCE));
            this.credit -= 0.1;
        }

        while (credit >= 0.05) {
            this.coinReturn.addCoin(new Coin(CoinType.FIVEPENCE));
            this.credit -= 0.05;
        }

    }
}