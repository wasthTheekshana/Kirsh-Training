package FactoryMethodPattern.ParcticalCode;


public class Application {
    public static void main(String[] args) {
        Package apPackage = CarFactory.createPackage(PackageCode.LUXURY);
        System.out.println(apPackage);

        Package bpPackage = CarFactory.createPackage(PackageCode.SMALL);
        System.out.println(bpPackage);


    }
}
