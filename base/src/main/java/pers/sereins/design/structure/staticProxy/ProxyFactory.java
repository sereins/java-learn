package pers.sereins.design.structure.staticProxy;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){

       return  Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (InvocationHandler) (proxy, method, args) -> {
                    System.out.println("jdk代理开始");
                    Object res  = method.invoke(target,args);
                    System.out.println("代理结束");
                    return res;
                });

    }
}
