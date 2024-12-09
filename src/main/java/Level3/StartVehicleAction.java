package Level3;

public class StartVehicleAction implements VehicleAction{
    private Vehicle vehicle;

    public StartVehicleAction(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run(){
        vehicle.start();
    }
}
