package pers.sereins.design.structure.Facade;

public class ReportFacade {

    public void generateReport() {

        OrderSys orderSys = new OrderSys();
        orderSys.getOrderNo();

        PaymentSys paymentSys = new PaymentSys(orderSys);
        paymentSys.getOrderAccount();

        DeliverSys deliverSys  = new DeliverSys();
        deliverSys.getDeliveryTime();
    }
}
