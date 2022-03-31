package pers.sereins.design.create.factory.builder;

import pers.sereins.design.create.factory.FactoryMethod;
import pers.sereins.design.create.factory.concrete.Phone;
import pers.sereins.design.create.factory.contract.Product;

public class PhoneBuilder extends FactoryMethod {

    @Override
    protected Product getConcrete() {
        return new Phone();
    }
}
