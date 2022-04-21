package pers.sereins.design.create.Singleton;


/**
 * 单例 懒汉式
 */
public class Singleton {

    private static Singleton singleton;

    // 构造私有化
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return  singleton;
    }
}


