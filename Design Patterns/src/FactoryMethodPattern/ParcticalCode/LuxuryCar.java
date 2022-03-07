package FactoryMethodPattern.ParcticalCode;

public class LuxuryCar extends Package{
    @Override
    protected void createPackage() {
        features.add(new AirBags());
        features.add(new PowerWindow());
        features.add(new SmartSunRoof());
    }
}
