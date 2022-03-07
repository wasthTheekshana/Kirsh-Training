package FactoryMethodPattern.ParcticalCode;

public class CarFactory {

    public static Package createPackage(PackageCode packageCode){
        switch (packageCode){
            case LUXURY:
                return new LuxuryCar();
            case SEDAN:
                return new SedanCar();
            case SMALL:
                return new SmallCar();
            default:
                return null;
        }
    }
}
