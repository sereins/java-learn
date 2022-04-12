package pers.sereins.design.create.factory.concrete;

import pers.sereins.design.create.factory.contract.Buttons;

public class MacOsButton implements Buttons {
    @Override
    public void paint() {
        System.out.println("macOs buttons");
    }
}
