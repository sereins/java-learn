package pers.sereins.design.create.factory.concrete;


import pers.sereins.design.create.factory.contract.CheckBox;

public class winCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("win checkBox");
    }
}
