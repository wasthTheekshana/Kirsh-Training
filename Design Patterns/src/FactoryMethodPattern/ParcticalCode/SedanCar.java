package FactoryMethodPattern.ParcticalCode;

public class SedanCar extends Package{
    @Override
    protected void createPackage() {
        features.add(new AirBags());
        features.add(new PowerWindow());
    }
}
