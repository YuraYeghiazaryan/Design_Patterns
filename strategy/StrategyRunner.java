package strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.performQuack();
        duck1.display();
        duck1.swim();
        System.out.println("Change Fly behavoir");
        duck1.setFlyBehavoir(new FlyNoWay());
        duck1.performFly();

        System.out.println("#----#----#----#----#----#----#");

        Duck duck2 = new RubberDuck();
        duck2.performFly();
        duck2.performQuack();
        duck2.display();
        duck2.swim();
    }
}
