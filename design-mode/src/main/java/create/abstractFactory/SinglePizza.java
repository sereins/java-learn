package create.abstractFactory;

public class SinglePizza implements Pizza{
    @Override
    public void create() {
        System.out.println("单人版Pizza");
    }
}
