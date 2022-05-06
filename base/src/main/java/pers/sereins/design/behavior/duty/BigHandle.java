package pers.sereins.design.behavior.duty;

public class BigHandle extends AbstractHandle{
    @Override
    public void handleReq(int days) {
        System.out.println("最终处理器统一假期" + days+ "天" );
    }
}
