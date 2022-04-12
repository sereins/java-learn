package pers.sereins.design.create.factory.builder;

import pers.sereins.design.create.factory.concrete.WinButton;
import pers.sereins.design.create.factory.concrete.winCheckbox;
import pers.sereins.design.create.factory.contract.Buttons;
import pers.sereins.design.create.factory.contract.CheckBox;
import pers.sereins.design.create.factory.contract.GuiFactory;

public class WinGui implements GuiFactory {

    @Override
    public Buttons createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new winCheckbox();
    }
}
