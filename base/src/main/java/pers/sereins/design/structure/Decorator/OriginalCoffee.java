package pers.sereins.design.structure.Decorator;

public class OriginalCoffee implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.println("原味咖啡！");
    }
}
