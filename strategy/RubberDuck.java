package strategy;

public class RubberDuck extends Duck{

    public RubberDuck(){
        this.flyBehavoir = new FlyNoWay();
        this.quackBehavoir = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }
}
