package pers.sereins.design.structure.Adapter;

// 一个具体的适配器
public class ChinaAdapter extends Adapter {


    public ChinaAdapter(Adaptee adaptee) {
        super(adaptee);
    }

    @Override
    public void chargeBy220V() {
        adaptee.chargeBy110V();
        System.out.println("适配器工作");
    }
}
