package pers.sereins.design.behavior.iterator;

public class ConcreteAggregate implements Aggregate {

    // 用数组作为元素的集合
    public Object[] objects;

    public ConcreteAggregate(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    // 获取具体的元素
    public Object getElement(int index) {
        if (index > objects.length) {
            return null;
        }
        return objects[index];
    }

    @Override
    public int getSize() {
        return objects.length;
    }
}
