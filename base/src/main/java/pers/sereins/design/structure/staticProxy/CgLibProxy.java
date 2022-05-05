package pers.sereins.design.structure.staticProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibProxy implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

    public CgLibProxy(Object target){
        this.target = target;
    }

    public Object getInstance(){
        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer();

        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());

        // 3. 设置回调函数
        enhancer.setCallback(this);

        // 4. 返回子类
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");

        Object invoke = method.invoke(target, objects);

        System.out.println("cglib代理结束");

        return invoke;
    }
}
