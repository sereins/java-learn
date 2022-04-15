package pers.sereins.design.create.generator;

public class Director {


    public CarProduct getCar1(){
        CarBuilder carBuilder = new CarBuilder(new CarProduct());

        carBuilder.setColor("红色");
        carBuilder.setSeat(4);
        carBuilder.setWheel(3);

        return carBuilder.getProduct();
    }

    public CarProduct getCar2() {
        CarBuilder carBuilder = new CarBuilder(new CarProduct());

        carBuilder.setColor("黄色");
        carBuilder.setSeat(5);
        carBuilder.setWheel(2);

        return carBuilder.getProduct();
    }
}
