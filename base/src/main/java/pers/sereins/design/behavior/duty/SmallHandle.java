package pers.sereins.design.behavior.duty;

public class SmallHandle extends AbstractHandle {
    @Override
    public void handleReq(int days) {
        if (days > 3){
            System.out.println("最小处理器不能处理大于"+days+"天的假期交给中级处理");
            getHandle().handleReq(days);
            return;
        }
        System.out.println("最小处理器同意假期" + days + "天");
    }
}
