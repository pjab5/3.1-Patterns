package Level3;

public class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("The bicycle starts");
    }

    @Override
    public void speedUp() {
        System.out.println("The bicycle is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("The bicycle is slowing down");
    }

}
