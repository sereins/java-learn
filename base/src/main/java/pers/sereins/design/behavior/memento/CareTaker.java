package pers.sereins.design.behavior.memento;

import java.util.ArrayList;

public class CareTaker {

    // 实际开发中可以维护一个存储的最大值，高于这个值，删除前面的元素

    // 集合来维护备忘录对象
    private final ArrayList<Memento> mementos = new ArrayList<>();

    public void saveMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
