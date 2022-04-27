package sereins.design.structure;

import pers.sereins.design.structure.Component.Component;
import pers.sereins.design.structure.Component.Composite;
import pers.sereins.design.structure.Component.Leaf;

public class ComponentTest {


    public static void main(String[] args) throws Exception {

        Composite composite = new Composite("组合1");
        composite.add(new Leaf("叶子1"));
        composite.add(new Leaf("叶子2"));

        Component 叶子1 = composite.getComposite("叶子1");

        Composite composite1 = new Composite("组合2");
        composite1.add(new Leaf("叶子3"));

        composite.add(composite1);

        System.out.println(composite.getComposite("叶子3").getName());


    }
}
