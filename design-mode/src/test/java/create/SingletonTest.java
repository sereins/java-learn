package create;

import create.singleton.Singleton;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void TestSingleton() {
        Singleton singleton = Singleton.GetInstance();
        System.out.println(singleton);
    }
}
