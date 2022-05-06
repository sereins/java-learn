package sereins.design.behavior;

import org.junit.jupiter.api.Test;
import pers.sereins.design.behavior.command.CommandA;
import pers.sereins.design.behavior.command.CommandB;
import pers.sereins.design.behavior.command.Invoker;
import pers.sereins.design.behavior.command.Receiver;
import pers.sereins.design.behavior.duty.BigHandle;
import pers.sereins.design.behavior.duty.MidHandle;
import pers.sereins.design.behavior.duty.SmallHandle;

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
}
