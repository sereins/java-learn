package create;

import create.factoryMethod.AbstractFactory;
import create.factoryMethod.ConcreteFactoryA;
import create.factoryMethod.ConcreteFactoryB;
import create.factoryMethod.Product;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    /**
     * 工厂方法的测试类
     */
    @Test
    public void factoryMethod() {
        String factory = "B";

        AbstractFactory absFactory = getFactory(factory);
        Product product = absFactory.newProduct();

        product.show();
    }

    // 获取一个具体的工厂
    private AbstractFactory getFactory(String type) {
        if (type.equals("A")) {
            return new ConcreteFactoryA();
        } else {
            return new ConcreteFactoryB();
        }
    }
}
