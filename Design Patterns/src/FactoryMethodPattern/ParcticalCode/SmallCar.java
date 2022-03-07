package FactoryMethodPattern.ParcticalCode;

public class SmallCar extends Package{
    @Override
    protected void createPackage() {
        features.add(new AirBags());
    }
}
