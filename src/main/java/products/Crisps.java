package products;

public class Crisps extends Product{

    private String flavour;

    public Crisps(String name, String brand, String flavour){
        super(name, brand);
        this.flavour = flavour;
    }

    public String getFlavour(){
        return flavour;
    }
}
