package Level3;

public class SpeedUpVehicleAction implements VehicleAction{
    private Vehicle vehicle;

    public SpeedUpVehicleAction(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run(){
        vehicle.speedUp();
    }
}
