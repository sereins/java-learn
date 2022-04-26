package pers.sereins.design.structure.Bridge;


// 高层抽象
abstract public class Abstraction {

    Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    // 具体抽象化需要实现的方法
    abstract void showResult();
}
