package pesr.sereins.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pesr.sereins.web.pojo.User;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)Context.getBean("user");
        user.setName("nihao");
        System.out.println(user);
    }
}
