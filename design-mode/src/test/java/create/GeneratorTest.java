package create;

import create.generator.ConcreteBuilderOne;
import create.generator.Director;
import org.junit.jupiter.api.Test;

public class GeneratorTest {

    @Test
    public void testGenerator(){
        Director director = new Director(new ConcreteBuilderOne());
        director.constructProduct();
    }
}
