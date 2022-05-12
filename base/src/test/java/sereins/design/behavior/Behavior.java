package sereins.design.behavior;

import org.junit.jupiter.api.Test;
import pers.sereins.design.behavior.command.CommandA;
import pers.sereins.design.behavior.command.CommandB;
import pers.sereins.design.behavior.command.Invoker;
import pers.sereins.design.behavior.command.Receiver;
import pers.sereins.design.behavior.duty.BigHandle;
import pers.sereins.design.behavior.duty.MidHandle;
import pers.sereins.design.behavior.duty.SmallHandle;
import pers.sereins.design.behavior.iterator.ConcreteAggregate;
import pers.sereins.design.behavior.iterator.Iterator;
import pers.sereins.design.behavior.mediator.ConcreteColleagueA;
import pers.sereins.design.behavior.mediator.ConcreteColleagueB;
import pers.sereins.design.behavior.mediator.ConcreteMediator;
import pers.sereins.design.behavior.memento.CareTaker;
import pers.sereins.design.behavior.memento.Game;
import pers.sereins.design.behavior.memento.Memento;
import pers.sereins.design.behavior.observer.ConcreteSubject;
import pers.sereins.design.behavior.observer.Observer1;
import pers.sereins.design.behavior.observer.Observer2;
import pers.sereins.design.behavior.observer.Observer3;
import pers.sereins.design.behavior.state.Context;
import pers.sereins.design.behavior.state.LowState;

public class Behavior {

    //责任链模式测试
    @Test
    public void duty(){

        SmallHandle smallHandle = new SmallHandle();

        MidHandle midHandle = new MidHandle();
        smallHandle.setNext(midHandle);

        BigHandle bigHandle = new BigHandle();
        midHandle.setNext(bigHandle);

        smallHandle.handleReq(2);
        System.out.println("--------------------------");
        smallHandle.handleReq(8);
        System.out.println("--------------------------");
        smallHandle.handleReq(10);
    }

    @Test
    public void command(){

        Receiver receiver = new Receiver();

        CommandA commandA = new CommandA(receiver);
        CommandB commandB = new CommandB(receiver);

        Invoker invoker = new Invoker(commandA);
        invoker.call();

        invoker.setCommand(commandB);
        invoker.call();
    }

    // 迭代器测试
    @Test
    public void iterator(){

        Object[] objs = {"hell","world","we"};

        ConcreteAggregate concreteAggregate = new ConcreteAggregate(objs);

        Iterator iterator = concreteAggregate.createIterator();

        while (iterator.isNull()){
            Object o = iterator.currentItem();
            System.out.println(o);
            iterator.next();
        }
    }

    // 中介者模式
    @Test
    public void mediator(){

        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();

        concreteMediator.register(concreteColleagueA);
        concreteMediator.register(concreteColleagueB);

        concreteColleagueA.send();
        System.out.println("-------------");
        concreteColleagueB.send();
    }

    // 备忘录模式
    @Test
    public void memento(){

        // 管理器
        CareTaker careTaker = new CareTaker();

        // 游戏对象
        Game game = new Game();

        game.playGame();
        game.playGame();

        // 存储
        Memento memento = game.saveProcess();
        careTaker.saveMemento(memento);

        game.exitGame();
        game.showScore();

        // 恢复状态
        game.restoreGame(careTaker.getMemento(0));
        game.showScore();
    }

    // 观察者模式
    @Test
    public void observer(){

        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.add(new Observer1());
        concreteSubject.add(new Observer2());
        concreteSubject.add(new Observer3());

        concreteSubject.notifyObserver();
    }

    // 状态模式测试
    @Test
    public void state(){

        Context context = new Context();


        context.add(30);
        context.add(30);
        context.add(30);
        context.add(-90);
    }
}
