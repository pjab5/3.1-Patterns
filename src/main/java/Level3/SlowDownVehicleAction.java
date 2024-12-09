package Level3;

public class SlowDownVehicleAction implements VehicleAction{
    private Vehicle vehicle;

    public SlowDownVehicleAction(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run(){
        vehicle.slowDown();
    }
}
