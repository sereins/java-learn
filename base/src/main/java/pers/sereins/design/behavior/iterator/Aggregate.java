package pers.sereins.design.behavior.iterator;

public interface Aggregate {
    // 创建具体的迭代器
    public Iterator createIterator();

    public Object getElement(int index);

    public int getSize();
}
