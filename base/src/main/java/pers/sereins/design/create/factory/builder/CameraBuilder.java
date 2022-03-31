package pers.sereins.design.create.factory.builder;

import pers.sereins.design.create.factory.FactoryMethod;
import pers.sereins.design.create.factory.concrete.Camera;
import pers.sereins.design.create.factory.contract.Product;

public class CameraBuilder  extends FactoryMethod {
    @Override
    protected Product getConcrete() {
        return new Camera();
    }
}
