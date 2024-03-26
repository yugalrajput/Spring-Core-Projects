package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
        Person person = (Person) context.getBean("personBean");   //context.getBean("personBean");
        UserBean user = (UserBean) context.getBean("userBean");//context.getBean("userBean");
        System.out.println("Person Name=" + person.getName());
        System.out.println("User Login=" + user.getLogin());
        System.out.println("User Password=" + user.getPassword());
    }
}
