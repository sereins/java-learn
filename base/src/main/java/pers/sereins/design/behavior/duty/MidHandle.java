package pers.sereins.design.behavior.duty;

public class MidHandle extends AbstractHandle{
    @Override
    public void handleReq(int days) {
        if (days > 7 ){
            System.out.println("中级不能处理");
            getHandle().handleReq(days);
            return;
        }
        System.out.println("中级处理器同意假期"+days+"天");
    }
}
