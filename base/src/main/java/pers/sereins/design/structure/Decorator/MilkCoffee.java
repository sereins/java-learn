package pers.sereins.design.structure.Decorator;

public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public void makeCoffee() {
        System.out.println("加牛奶");
    }
}
