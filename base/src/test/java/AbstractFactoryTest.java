import pers.sereins.design.create.factory.builder.MacOsGui;
import pers.sereins.design.create.factory.builder.WinGui;
import pers.sereins.design.create.factory.contract.Buttons;
import pers.sereins.design.create.factory.contract.CheckBox;
import pers.sereins.design.create.factory.contract.GuiFactory;

public class AbstractFactoryTest {

    Buttons buttons;
    CheckBox checkBox;

    AbstractFactoryTest(String os) {
        GuiFactory factory;
        if (os.equals("mac")){
             factory = new MacOsGui();
        }else {
             factory = new WinGui();
        }
        buttons =  factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        buttons.paint();
        checkBox.paint();
    }


    public static void main(String[] args) {
        String os = "mac";

        AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest(os);

        abstractFactoryTest.paint();
    }


}
