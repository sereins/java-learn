package pers.sereins.design.behavior.mediator;

// 抽象角色
abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract public void receive();

    abstract  public void send();
}
