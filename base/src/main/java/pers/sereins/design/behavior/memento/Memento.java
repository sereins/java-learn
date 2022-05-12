package pers.sereins.design.behavior.memento;

// 备忘录实体:记录被保存的属性
public class Memento {

    private final int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
