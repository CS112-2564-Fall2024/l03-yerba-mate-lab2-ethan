public class Tea extends CaffeinatedBeverage {
    
    public static final int DEFAULT_BREW_TEMP = 90; // in celsius

    //VARIABLES
    private int brewTemp;

    //CONSTRUCTORS

    //FULL
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    //DEFAULT
    public Tea() {
        super();
        this.brewTemp = DEFAULT_BREW_TEMP;
    }

    //COPY
    public Tea(Tea other) {
        super(other.getName(), other.getOunces(), other.getPrice());
        this.brewTemp = other.brewTemp;
    }


    //SETTERS & GETTERS
    public int getBrewTwmp() {
        return brewTemp;
    }

    public void setBrewTemo(int brewTemp) {
        if (brewTemp > 0) {
            this.brewTemp = brewTemp;
        }
    }

    //Equals 
    @Override
    public boolean equals(Object otherTea) {
        if (otherTea == null || getClass() != otherTea.getClass()) {
            return false;
        }
        Tea other = (Tea) otherTea;

        return this.getName().equals(other.getName()) &&
                this.getOunces() == other.getOunces() &&
                this.getPrice() == other.getPrice() &&
                brewTemp == other.brewTemp;
    }

    //toString
    @Override
    public String toString() {
        return "Tea: " + getName() 
            + "\n" + getOunces() + " Ounces\n" 
            + "Brewed @ " + brewTemp + "°C\n" 
                + "$" + getPrice();
    }
    
}
