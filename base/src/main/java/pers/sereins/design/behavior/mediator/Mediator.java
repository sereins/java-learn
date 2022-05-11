package pers.sereins.design.behavior.mediator;

// 抽象中介者
public interface Mediator {

    // 注册
    void register(Colleague colleague);

    // 转发
    void relay(Colleague co);
}
