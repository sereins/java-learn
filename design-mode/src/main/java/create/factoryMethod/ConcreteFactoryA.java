package create.factoryMethod;

public class ConcreteFactoryA extends AbstractFactory {

    @Override
    public Product newProduct() {
        return new ProductA();
    }
}
