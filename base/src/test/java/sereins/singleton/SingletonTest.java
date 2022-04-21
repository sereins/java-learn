package sereins.singleton;

import org.junit.jupiter.api.Test;
import pers.sereins.design.create.Singleton.Singleton;
import pers.sereins.design.create.Singleton.SingletonLazy;

public class SingletonTest {

    @Test
    public void test1(){
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.hashCode());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.hashCode());
    }

    /** 懒汉式 线程安全  */
    @Test
    public void singletonLazy(){
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1.hashCode());

        SingletonLazy singleton2 = SingletonLazy.getInstance();
        System.out.println(singleton2.hashCode());
    }
}
