package pers.sereins.design.structure.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public int getNumber() {
        int rs = 0;
        for (Component component : components) {
            rs += component.getNumber();
        }
        return rs;
    }


    @Override
    public void add(Component component) throws Exception {
        components.add(component);
    }

    @Override
    public Component getComposite(String name) {
        for (Component component : components) {
            Component com = component.getComposite(name);
            if (com != null)
                return com;
        }
        return null;
    }
}
