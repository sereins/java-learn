package sereins.design.structure;

import org.junit.jupiter.api.Test;
import pers.sereins.design.structure.staticProxy.*;

public class Proxy {


    @Test
    public void staticProxy() {

        TeacherDao teacherDao = new TeacherDao();

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
    }

    @Test // jdk代理
    public void jdkProxy(){
        TeacherDao teacherDao = new TeacherDao();

        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);

        ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();

        proxyInstance.teach();
    }

    @Test
    public void cglibProxy(){
        MyTeacher myTeacher = new MyTeacher();

        CgLibProxy cgLibProxy = new CgLibProxy(myTeacher);

        MyTeacher instance = (MyTeacher)cgLibProxy.getInstance();

        instance.teach();
    }
}
