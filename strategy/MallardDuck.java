package strategy;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavoir = new FlyWithWings();
        this.quackBehavoir = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
