package create.abstractFactory;

public class FamilyPizza implements Pizza{
    @Override
    public void create() {
        System.out.println("家庭版本Pizza");
    }
}
