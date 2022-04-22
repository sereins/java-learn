package pers.sereins.design.structure.Adapter;

// 抽象适配器类
abstract class Adapter implements Target{

    // 现有接口的引用
    Adaptee adaptee;

    public Adapter(Adaptee adapter){
        this.adaptee =  adapter;
    }


}
