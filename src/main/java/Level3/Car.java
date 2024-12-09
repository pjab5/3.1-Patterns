package Level3;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("The car starts");
    }

    @Override
    public void speedUp() {
        System.out.println("The car is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("The car is slowing down");
    }
}
