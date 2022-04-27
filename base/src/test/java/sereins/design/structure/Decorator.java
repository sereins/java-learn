package sereins.design.structure;

import pers.sereins.design.structure.Decorator.MilkCoffee;
import pers.sereins.design.structure.Decorator.OriginalCoffee;
import pers.sereins.design.structure.Decorator.SugarCoffee;

public class Decorator {

    public static void main(String[] args) {

        OriginalCoffee originalCoffee = new OriginalCoffee();
        originalCoffee.makeCoffee();

        MilkCoffee milkCoffee = new MilkCoffee(originalCoffee);
        milkCoffee.makeCoffee();

        SugarCoffee sugarCoffee = new SugarCoffee(milkCoffee);
        sugarCoffee.makeCoffee();
    }
}
