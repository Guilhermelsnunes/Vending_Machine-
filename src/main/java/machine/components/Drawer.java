package machine.components;

import products.Product;

import java.util.ArrayList;

public class Drawer {

    private ArrayList<Product>items;
    private EnumCode enumCode;
    private double price;


    public Drawer(EnumCode enumCode, double price) {
        this.items = new ArrayList<>();
        this.enumCode = enumCode;
        this.price = price;
    }


    public EnumCode getEnumCode() {
        return enumCode;
    }

    public double getPrice() {
        return price;
    }


    public int itemCount(){
        return this.items.size();
        }

    public void addItem(Product product){
        this.items.add(product);
    }

    public Product vendProduct(){
        return this.items.remove(0);
    }


}
