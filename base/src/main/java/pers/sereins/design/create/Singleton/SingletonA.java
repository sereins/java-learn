package pers.sereins.design.create.Singleton;

/**
 * 使用静态内部类
 * 延迟初始化，调用getInstance才会初始化对象
 * 线程安全。
 */

public class SingletonA {

    private SingletonA() {};

    private static class InnerClass{
        private static final SingletonA instance = new SingletonA();
    }

    public static SingletonA getInstance() {
        return InnerClass.instance;
    }
}
