package strategy;

abstract class Duck {
    FlyBehavoir flyBehavoir;
    QuackBehavoir quackBehavoir;

    public void performFly(){
        flyBehavoir.fly();
    }

    public void setFlyBehavoir(FlyBehavoir behavoir){
        this.flyBehavoir = behavoir;
    }

    public void performQuack(){
        quackBehavoir.quack();
    }

    public void setQuackBehavoir(QuackBehavoir behavoir){
        this.quackBehavoir = behavoir;
    }
    public abstract void display();
    public void swim(){
        System.out.println("I am swimming from Duck class");
    }
}
