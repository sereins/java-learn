package pers.sereins.design.create.generator;

public class CarBuilder implements Builder {

    private final CarProduct carProduct;

    CarBuilder(CarProduct carProduct) {
        this.carProduct = carProduct;
    }

    @Override
    public void setColor(String color) {
        carProduct.setColor(color);
    }

    @Override
    public void setSeat(int seat) {
        carProduct.setSeat(seat);
    }


    @Override
    public void setWheel(int wheel) {
        carProduct.setWheelNumber(wheel);
    }

    @Override
    public CarProduct getProduct() {
        return this.carProduct;
    }
}
