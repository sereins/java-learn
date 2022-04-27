package pers.sereins.design.structure.Decorator;

abstract public class CoffeeDecorator implements ICoffee {

    private ICoffee iCoffee;

    public CoffeeDecorator(ICoffee iCoffee) {
        this.iCoffee = iCoffee;
    }
}
