package pers.sereins.design.create.factory.concrete;

import pers.sereins.design.create.factory.contract.Buttons;

public class WinButton implements Buttons {
    @Override
    public void paint() {
        System.out.println("win buttons");
    }
}
