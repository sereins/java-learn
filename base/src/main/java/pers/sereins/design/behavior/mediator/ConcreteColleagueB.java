package pers.sereins.design.behavior.mediator;

public class ConcreteColleagueB extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体类B收到通知");
    }

    @Override
    public void send() {
        System.out.println("具体类B发送通知");
        mediator.relay(this);
    }
}
