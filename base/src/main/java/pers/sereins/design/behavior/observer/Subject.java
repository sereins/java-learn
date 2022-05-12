package pers.sereins.design.behavior.observer;

// 抽象的主题
public interface Subject {

    // 新增观察者
    public void add(Observer observer);

    // 移除观察者
    public void remover(Observer observer);

    // 通知观察者
    public void notifyObserver();
}
