
public class Main {
    public static void main(String[] args) {
        String type = "Electric";
        VehicleFactory vehicleFactory;
        if(type.equalsIgnoreCase("Electric"))
        {
            vehicleFactory = new ElectricalVehicleFactory();
        } else if(type.equalsIgnoreCase("Petrol"))
        {
            vehicleFactory = new ElectricalVehicleFactory();
        }else{
            throw new UnsupportedOperationException("Unknown type: " + type);
        }
        Car car = vehicleFactory.createCar();
        Bike bike = vehicleFactory.createBike();
        car.assemble();
        bike.assemble();
    }
}