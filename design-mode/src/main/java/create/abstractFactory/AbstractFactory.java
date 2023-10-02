package create.abstractFactory;

// 抽象工厂
public abstract class AbstractFactory {
    // 创建pizza
    public abstract Pizza createPizza();

    public abstract Hamburger createHamburger();
}
