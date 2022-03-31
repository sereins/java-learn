package pers.sereins.design.create.factory.concrete;

import pers.sereins.design.create.factory.contract.Product;

public class Phone implements Product {
    @Override
    public void soSomething() {
        System.out.println("I am phone ,I can call");
    }
}
