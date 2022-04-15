package pers.sereins.design.create.generator;

public interface Builder {

    void setColor(String color);

    void setSeat(int seat);

    void setWheel(int wheel);

    CarProduct getProduct();
}
