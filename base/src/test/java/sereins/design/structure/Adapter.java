package sereins.design.structure;

import org.junit.jupiter.api.Test;
import pers.sereins.design.structure.Adapter.AmericanCharge;
import pers.sereins.design.structure.Adapter.ChinaAdapter;

/**
 * 适配器测试类
 */
public class Adapter {

    @Test
    public void adapter() {

        ChinaAdapter chinaAdapter = new ChinaAdapter(new AmericanCharge());

        chinaAdapter.chargeBy220V();
    }

}
