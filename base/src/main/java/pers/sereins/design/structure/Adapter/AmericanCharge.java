package pers.sereins.design.structure.Adapter;

public class AmericanCharge implements Adaptee{
    @Override
    public void chargeBy110V() {
        System.out.println("美国的110v充电器");
    }
}
