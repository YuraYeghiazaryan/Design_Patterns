package strategy;

public class Quack implements QuackBehavoir{
    @Override
    public void quack() {
        System.out.println("Quack from Quack class");
    }
}
