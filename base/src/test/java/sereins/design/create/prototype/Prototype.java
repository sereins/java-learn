package sereins.design.create.prototype;

import org.junit.jupiter.api.Test;
import pers.sereins.design.create.prototype.People;

public class Prototype {

    @Test
    void prototype(){

        People people = new People("小李",2);

        System.out.println(people);

        System.out.println(people.clone());
    }
}
