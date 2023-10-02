package create;

import create.abstractFactory.FamilyFactory;
import create.abstractFactory.SingleFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void TestSingle(){
        SingleFactory singleFactory = new SingleFactory();
        singleFactory.createPizza().create();
        singleFactory.createHamburger().create();
    }

    @Test
    public void TestFamily(){
        FamilyFactory familyFactory = new FamilyFactory();
        familyFactory.createPizza().create();
        familyFactory.createHamburger().create();
    }
}
