package sereins.design.structure;

import pers.sereins.design.structure.Bridge.GreenImplementor;
import pers.sereins.design.structure.Bridge.RedImplementor;
import pers.sereins.design.structure.Bridge.Tricycle;

public class Bridge {


    public static void main(String[] args) {

        // 红色的轮车
        Tricycle tricycle = new Tricycle(new RedImplementor());
        tricycle.showResult();

        Tricycle tricycle1 = new Tricycle(new GreenImplementor());
        tricycle1.showResult();
    }
}
