package coins;

public enum CoinType {

    ONEPENCE(0.01),
    TWOPENCE(0.02),
    FIVEPENCE(0.05),
    TENPENCE(0.1),
    TWENTYPENCE(0.2),
    FIFTPENCE(0.5),
    ONEPOUND(1.0),
    TWOPOUND(2.0);


//    name for the value
    private double value;


//    constructor
    CoinType(double value) {
        this.value = value;
    }


//    function to get value
    public double getValue(){
        return value;
    }

}
