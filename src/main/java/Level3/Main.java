package Level3;

import Level1.Undo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleActionExecutor vehicleActionExecutor = new VehicleActionExecutor();
        Car car = new Car();
        vehicleActionExecutor.runAction(new StartVehicleAction(car));
        vehicleActionExecutor.runAction(new SpeedUpVehicleAction(car));
        vehicleActionExecutor.runAction(new SlowDownVehicleAction(car));
        System.out.println(vehicleActionExecutor.getVehicleActions());
    }
}
