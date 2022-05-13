package pers.sereins.design.behavior.visitor;

public class ElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
