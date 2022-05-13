package pers.sereins.design.behavior.visitor;

public class VisitorA implements Visitor {
    @Override
    public void visitor(ElementA elementA) {
        System.out.println("A访问A");
    }

    @Override
    public void visitor(ElementB elementB) {
        System.out.println("A反问B");
    }
}
