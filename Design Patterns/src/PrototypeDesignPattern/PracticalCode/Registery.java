package PrototypeDesignPattern.PracticalCode;

import java.util.HashMap;
import java.util.Map;

public class Registery {
    private Map<VehicalType,Vehical> vehicales = new HashMap<>();

    public Registery() {
        this.initialize();
    }

    public  Vehical getVehical(VehicalType vehicalType){

        Vehical vehical = null;
        try {
            vehical = (Vehical) vehicales.get(vehicalType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehical;
    }

    private void initialize() {

        Car car = new Car();
        car.setEngineCapacity(2000);
        car.setType("lux");
        car.setFuelType("Gasoline");

        Bus bus = new Bus();
        bus.setEngineCapacity(2000);
        bus.setFuelType("Gasoline");
        bus.setSeatNumber(55);

        vehicales.put(VehicalType.CAR,car);
        vehicales.put(VehicalType.BUS,bus);

    }
}
