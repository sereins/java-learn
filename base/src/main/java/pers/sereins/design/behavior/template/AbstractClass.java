package pers.sereins.design.behavior.template;

public abstract class AbstractClass {

    public void templateMethod() {

        this.something();

        this.abstractMethod();

        this.abstractMethod1();
    }

    public void something() {
        System.out.println("抽象类中的方法");
    }


    public abstract void abstractMethod();

    public abstract void abstractMethod1();

}
