package pers.sereins.design.create.Singleton;

/**
 * 双重锁检查机制
 */

public class SingletonLock {
    private static SingletonLock _instance;

    private SingletonLock() {
    }

    public static SingletonLock getInstance() {
        if (_instance == null) {
            synchronized (SingletonLock.class) {
                if (_instance == null) {
                    _instance = new SingletonLock();
                }

            }
        }
        return _instance;
    }
}
