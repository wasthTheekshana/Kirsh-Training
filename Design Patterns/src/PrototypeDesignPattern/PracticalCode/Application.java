package PrototypeDesignPattern.PracticalCode;

public class Application {

    public static void main(String[] args) {
        Registery registery = new Registery();
        Car car = (Car) registery.getVehical(VehicalType.CAR);
        System.out.println(car);

        car.setType("mini");

        System.out.println(car);
    }
}
