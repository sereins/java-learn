package create.abstractFactory;

public class SingleFactory extends AbstractFactory {
    @Override
    public Pizza createPizza() {
        return new SinglePizza();
    }

    @Override
    public Hamburger createHamburger() {
        return new SingleHamburger();
    }
}
