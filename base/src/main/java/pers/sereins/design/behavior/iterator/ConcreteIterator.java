package pers.sereins.design.behavior.iterator;

// 具体的迭代器
public class ConcreteIterator implements Iterator {

    // 持有聚集对象的引用
    private final Aggregate aggregate;

    // 当前元素的指针
    private int index = 0;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void next() {
        index++ ;
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }

    public boolean isNull(){
        return index < aggregate.getSize();
    }
}
