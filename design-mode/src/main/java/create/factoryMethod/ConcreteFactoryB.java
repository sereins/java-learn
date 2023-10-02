package create.factoryMethod;

public class ConcreteFactoryB extends AbstractFactory{
    @Override
    public Product newProduct() {
        return new ProductB();
    }
}
