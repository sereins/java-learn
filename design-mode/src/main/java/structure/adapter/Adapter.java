package structure.adapter;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void dc20v() {
        adaptee.vc220v();
        System.out.println("现有结构");
    }
}
