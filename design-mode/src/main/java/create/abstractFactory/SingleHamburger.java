package create.abstractFactory;

public class SingleHamburger implements Hamburger{
    @Override
    public void create() {
        System.out.println("单人版Hamburger");
    }
}
