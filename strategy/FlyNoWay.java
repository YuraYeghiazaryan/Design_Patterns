package strategy;

public class FlyNoWay implements FlyBehavoir {
    @Override
    public void fly() {
        System.out.println("Fly from FlyNoWay class");
    }
}
