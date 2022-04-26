package pers.sereins.design.structure.Bridge;

public class GreenImplementor implements Implementor{
    @Override
    public void coloring() {
        System.out.println("绿色");
    }
}
