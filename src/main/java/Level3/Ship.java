package Level3;

public class Ship extends Vehicle{
    @Override
    public void start() {
        System.out.println("The ship starts");
    }

    @Override
    public void speedUp() {
        System.out.println("The ship is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("The ship is slowing down");
    }
}

