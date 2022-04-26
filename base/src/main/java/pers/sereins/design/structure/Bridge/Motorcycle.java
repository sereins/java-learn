package pers.sereins.design.structure.Bridge;

public class Motorcycle extends Abstraction {

    public Motorcycle(Implementor implementor){
        super(implementor);
    }

    @Override
    void showResult() {
        implementor.coloring();
        System.out.println("摩托车");
    }
}
