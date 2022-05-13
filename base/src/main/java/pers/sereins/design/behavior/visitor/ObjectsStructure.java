package pers.sereins.design.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectsStructure {

    // 包含所有元素的集合
    private ArrayList<Element> elements = new ArrayList<>();

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){

        Iterator<Element> iterator = elements.iterator();

        while (iterator.hasNext()){
            Element next = iterator.next();
            next.accept(visitor);
        }
    }
}
