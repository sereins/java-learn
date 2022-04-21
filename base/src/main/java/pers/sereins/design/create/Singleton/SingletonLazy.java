package pers.sereins.design.create.Singleton;


/**
 * 单例 懒汉式 加入同步锁实现线程安全
 */
public class SingletonLazy {

    private static SingletonLazy singleton;

    // 构造私有化
    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}


