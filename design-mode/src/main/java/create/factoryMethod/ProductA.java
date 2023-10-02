package create.factoryMethod;

/**
 * 具体的产品类型A
 */
public class ProductA implements Product{
    @Override
    public void show() {
        System.out.println("我是产品A...");
    }
}
