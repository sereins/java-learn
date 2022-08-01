package create.factoryMethod;


/**
 * 抽象工厂类
 * 最传统的工厂方法：每个具体的工厂类都，只能创建一个具体的产品。不够灵活
 * 在使用中：最简单的实现就是只有一个工厂类，在这个方法中根据不同的参数来实例化
 * 不同的产品
 */
public abstract class AbstractFactory {
    public abstract Product newProduct();
}
