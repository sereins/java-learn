package pers.sereins.design.behavior.visitor;

public class ElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
