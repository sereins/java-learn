package pers.sereins.design.structure.Bridge;

public class RedImplementor implements Implementor{

    @Override
    public void coloring() {
        System.out.println("红色");
    }
}
