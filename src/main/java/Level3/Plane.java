package Level3;

public class Plane extends Vehicle{
    @Override
    public void start() {
        System.out.println("The plane starts");
    }

    @Override
    public void speedUp() {
        System.out.println("The plane is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("The plane is slowing down");
    }
}
