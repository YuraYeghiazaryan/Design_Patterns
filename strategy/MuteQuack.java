package strategy;

public class MuteQuack implements QuackBehavoir{
    @Override
    public void quack() {
        System.out.println("Quack from MuteQuack class");
    }
}
