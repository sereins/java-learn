package pers.sereins.design.create.factory.builder;

import pers.sereins.design.create.factory.concrete.MacOsButton;
import pers.sereins.design.create.factory.concrete.MacOsCheckBox;
import pers.sereins.design.create.factory.contract.Buttons;
import pers.sereins.design.create.factory.contract.CheckBox;
import pers.sereins.design.create.factory.contract.GuiFactory;

public class MacOsGui implements GuiFactory {
    @Override
    public Buttons createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
