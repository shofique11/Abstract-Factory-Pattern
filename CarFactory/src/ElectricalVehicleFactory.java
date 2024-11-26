public class ElectricalVehicleFactory implements VehicleFactory{
    @Override
    public Bike createBike() {
        return new ElectricalBike();
    }

    @Override
    public Car createCar() {
        return new ElectricalCar();
    }
}
