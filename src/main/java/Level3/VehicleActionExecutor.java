package Level3;

import java.util.ArrayList;

public class VehicleActionExecutor {
    private final ArrayList<VehicleAction> vehicleActions = new ArrayList<>();

    public void runAction(VehicleAction vehicleAction){
        vehicleActions.add(vehicleAction);
        vehicleAction.run();
    }

    public ArrayList<VehicleAction> getVehicleActions() {
        return vehicleActions;
    }
}
