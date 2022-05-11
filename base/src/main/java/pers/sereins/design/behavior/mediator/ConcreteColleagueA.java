package pers.sereins.design.behavior.mediator;


public class ConcreteColleagueA extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体类A收到通知");
    }

    @Override
    public void send() {
        System.out.println("具体类A发送通知");
        mediator.relay(this);
    }
}
