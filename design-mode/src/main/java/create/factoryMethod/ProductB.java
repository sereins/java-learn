package create.factoryMethod;

/**
 * 具体的产品类型B
 */
public class ProductB implements Product {
    @Override
    public void show() {
        System.out.println("我是产品B...");
    }
}
