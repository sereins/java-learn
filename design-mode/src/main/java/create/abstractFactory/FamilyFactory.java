package create.abstractFactory;

public class FamilyFactory extends AbstractFactory {
    @Override
    public Pizza createPizza() {
        return new FamilyPizza();
    }

    @Override
    public Hamburger createHamburger() {
        return new FamilyHamburger();
    }
}
