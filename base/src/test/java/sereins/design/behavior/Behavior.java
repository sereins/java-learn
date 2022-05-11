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
}
