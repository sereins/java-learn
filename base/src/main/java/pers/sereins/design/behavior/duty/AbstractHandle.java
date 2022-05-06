package pers.sereins.design.behavior.duty;

abstract public class AbstractHandle {

    private AbstractHandle next;


    public void setNext(AbstractHandle handle ){
        this.next = handle;
    }

    // 得到下一个
    public AbstractHandle getHandle (){
        return next;
    }

    // 处理请求
    abstract public void handleReq(int days);
}
