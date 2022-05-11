package pers.sereins.design.behavior.iterator;

public interface Iterator {
    // 移动到下一个元素
    public void next();

    // 返回当前的元素
    public Object currentItem();

    public boolean isNull();
}
