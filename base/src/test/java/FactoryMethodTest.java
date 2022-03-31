import pers.sereins.design.create.factory.FactoryMethod;
import pers.sereins.design.create.factory.builder.CameraBuilder;
import pers.sereins.design.create.factory.builder.PhoneBuilder;

public class FactoryMethodTest {


    public static void main(String[] args) {

        String pro = "phone";

        FactoryMethodTest factoryMethod = new FactoryMethodTest();

        FactoryMethod factory = factoryMethod.getFactory(pro);

        factory.doSomething();
    }


    public FactoryMethod getFactory(String type) {
        return type.equals("camera") ? new CameraBuilder() : new PhoneBuilder();
    }
}
