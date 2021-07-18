package assignment2;

public abstract class DessertItems {

    public abstract double getCost(int numOfQuantities);
}

class Candy extends DessertItems{

    @Override
    public double getCost(int numOfQuantities) {
        return numOfQuantities*60;
    }
}

class Cookie extends DessertItems{

    @Override
    public double getCost(int numOfQuantities) {
        return numOfQuantities*70;
    }
}

class IceCream extends DessertItems{

    @Override
    public double getCost(int numOfQuantities) {
        return numOfQuantities*50;
    }
}