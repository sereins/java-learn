package pers.sereins.design.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

// 具体的中介者类
public class ConcreteMediator implements Mediator {

    // 具体的中介者维护了所有的角色
    private final List<Colleague> colleagueList = new ArrayList<Colleague>();

    // 注册角色
    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague co) {
        for (Colleague  cl: colleagueList) {
            if (!co.equals(cl)){
                cl.receive();
            }
        }
    }
}
