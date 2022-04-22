package sereins.singleton;

import org.junit.jupiter.api.Test;
import pers.sereins.design.create.Singleton.Singleton;
import pers.sereins.design.create.Singleton.SingletonA;
import pers.sereins.design.create.Singleton.SingletonLazy;
import pers.sereins.design.create.Singleton.SingletonLock;

public class SingletonTest {

    @Test
    public void test1() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton instance1 = Singleton.getInstance();
                System.out.println(instance1.hashCode());
            }).start();
        }
    }

    /**
     * 懒汉式 线程安全
     */
    @Test
    public void singletonLazy() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                SingletonLazy instance = SingletonLazy.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance.hashCode());
            }).start();
        }
    }

    /**
     * 静态内部类实现
     */
    @Test
    public void singletonA() {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                SingletonA instance = SingletonA.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance.hashCode());
            }).start();
        }

    }

    /**
     * 双重锁
     * 线程安全 执行效率高 推荐使用
     */
    @Test
    public void singletonLock() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonLock instance = SingletonLock.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + instance.hashCode());
            }).start();
        }
    }
}
