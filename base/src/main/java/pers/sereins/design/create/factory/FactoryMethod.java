package pers.sereins.design.create.factory;


import pers.sereins.design.create.factory.contract.Product;

// 设计模式 工厂方法
public abstract class FactoryMethod {

    public void doSomething(){

        Product product = getConcrete();

        product.soSomething();
    }

    // 没一个具体的创建者都要实现的方法
    protected abstract Product getConcrete();
}
