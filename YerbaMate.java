public class YerbaMate extends Tea {
    
    //VARIABLES

    public static final int DEFAULT_NUM_PASSES = 0;

    private int numPasses;

    //CONSTRUCTOS

    //COPY
    public YerbaMate() {
        super();
        this.numPasses = numPasses;
    }

    //FULL
    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    //COPY
    public YerbaMate(YerbaMate othYerbaMate) {
        super(othYerbaMate.getName(), othYerbaMate.getOunces(), othYerbaMate.getPrice(), othYerbaMate.getBrewTwmp());
        this.numPasses = othYerbaMate.numPasses;
    }

    // SETTERS & GETTERS
    public int getNumPasses() {
        return numPasses;
    }

    public void setNumPasses(int numPasses) {
        this.numPasses = numPasses;
    }

    //refill allows water to be added to refill current number of ounces
    public int refill(int refill) {
        setOunces(getOunces() + refill);
        return getOunces();
    }

    //Equals
    @Override
    public boolean equals(Object othYerbaMate) {
        if (othYerbaMate == null || getClass() != othYerbaMate.getClass()) {
            return false;
        }
        YerbaMate other = (YerbaMate) othYerbaMate;

        return this.getName().equals(other.getName()) &&
                this.getOunces() == other.getOunces() &&
                this.getPrice() == other.getPrice() &&
                this.getBrewTwmp() == other.getBrewTwmp() &&
                numPasses == other.numPasses;
    }

    //toString
    @Override
    public String toString() {
         return "YerbaMate: " + getName() 
            + "\n" + getOunces() + " Ounces\n" 
            + "Brewed @ " + getBrewTwmp() + "°C\n" 
            + "$" + getPrice() + "\n" 
            + numPasses + " passes so far";
    }
}

