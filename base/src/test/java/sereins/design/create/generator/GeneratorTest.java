package sereins.design.create.generator;

import org.junit.jupiter.api.Test;
import pers.sereins.design.create.generator.CarProduct;
import pers.sereins.design.create.generator.Director;

public class GeneratorTest {

    @Test
    void getCar()
    {
        Director director = new Director();

        CarProduct car1 = director.getCar1();
        System.out.println(car1);

        System.out.println();

        CarProduct car2 = director.getCar2();
        System.out.println(car2);
    }
}
