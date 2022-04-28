package pers.sereins.design.structure.Facade;

import java.math.BigDecimal;

public class PaymentSys {

    private OrderSys orderSys;

    public PaymentSys(OrderSys orderSys) {
        this.orderSys = orderSys;
    }

    public OrderSys getOrderSys() {
        return orderSys;
    }

    public BigDecimal getOrderAccount()
    {
        System.out.printf("获取%s订单支付金额%n",orderSys.getOrderNo());
        return BigDecimal.valueOf(500);
    }
}
