public class CaffeinatedBeverage {

    public static final String DEFAULT_NAME = "coffee";
    public static final int DEFAULT_OUNCES = 6;
    public static final double DEFAULT_PRICE = 4.99;

    //VARIABLES
    private String name;
    private int ounces;
    private double price;

    //CONSTRUCTORS

    //DEFAULT
    public CaffeinatedBeverage() {
        this(DEFAULT_NAME, DEFAULT_OUNCES, DEFAULT_PRICE);
    }
    
    //FULL
    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    //COPY
    public CaffeinatedBeverage(CaffeinatedBeverage other) {
        this.name = other.name;
        this.ounces = other.ounces;
        this.price = other.price;
    }

    //GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        }
        return false;
    }

    //sip method, take int amount and subtracts from current ounces
    public int sip(int sipAmount) {
        this.ounces -= sipAmount;

        //if sip amount goes below 0 sets it to 0
        if (this.ounces <= 0) {
            this.ounces = 0;
        }

        isEmpty();
        return ounces;
    }

    //checks if cup is empty
    public boolean isEmpty() {
        if (ounces == 0) {
            return false;
        } else {
            return true;
        }
    }

    //SETALL
    public void setAll(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    //toSTRING
    public String toString() {
        return "Name: " + name 
            + "\nOunces: " + ounces 
            + "\nPrice: " + price;

    }

    //EQUALS METHOD
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
               this.name.equals(that.name);
    }
}