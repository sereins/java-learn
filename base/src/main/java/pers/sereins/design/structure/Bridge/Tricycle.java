package pers.sereins.design.structure.Bridge;

public class Tricycle extends Abstraction {

    public Tricycle(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void showResult() {
        implementor.coloring();
        System.out.println("三轮车");
    }
}
