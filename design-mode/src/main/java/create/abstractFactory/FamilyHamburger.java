package create.abstractFactory;

public class FamilyHamburger implements Hamburger{
    @Override
    public void create() {
        System.out.println("家庭版Hamburger");
    }
}
