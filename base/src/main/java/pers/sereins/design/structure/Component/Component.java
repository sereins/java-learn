package pers.sereins.design.structure.Component;


/** 抽象的个体组合定义(可以包含增删该差) */

abstract public class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public int getNumber();

    // 向组件中新增节点
    abstract public void add(Component component) throws Exception;

    public abstract Component getComposite(String name);
}
