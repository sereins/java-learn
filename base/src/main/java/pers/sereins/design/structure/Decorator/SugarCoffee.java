package pers.sereins.design.structure.Decorator;

public class SugarCoffee extends CoffeeDecorator{
    @Override
    public void makeCoffee() {
        System.out.println("加糖");
    }

    public SugarCoffee(ICoffee iCoffee) {
        super(iCoffee);
    }
}
