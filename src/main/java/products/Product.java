package products;

public abstract class Product {

    String name;
    String brand;


    public Product(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    //getters below
    public String getName(){
        return name;
    }

    public String brand(){
        return brand;
    }

}
