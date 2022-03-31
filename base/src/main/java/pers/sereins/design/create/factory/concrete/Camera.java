package pers.sereins.design.create.factory.concrete;

import pers.sereins.design.create.factory.contract.Product;

public class Camera implements Product {
    @Override
    public void soSomething() {
        System.out.println("Im camera i can take photo");
    }
}
