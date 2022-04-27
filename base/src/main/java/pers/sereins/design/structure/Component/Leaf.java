package pers.sereins.design.structure.Component;

/**
 * 具体的叶子节点
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public int getNumber() {
        return 20;
    }

    @Override
    public void add(Component component) throws Exception {
        throw new Exception(this.getName() + "已经是最基本的节点了不能在增加了");
    }

    @Override
    public Component getComposite(String name) {
        if (getName().equals(name))
            return this;
        return null;
    }
}
