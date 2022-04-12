package pers.sereins.design.create.factory.concrete;


import pers.sereins.design.create.factory.contract.CheckBox;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("macOs checkBox");
    }
}
