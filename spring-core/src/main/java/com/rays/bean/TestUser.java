package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestUser {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("UserBean.xml"));

        UserBean bean = (UserBean) factory.getBean("userBean");

        System.out.println(bean.getName());
        System.out.println(bean.getLogin());
        System.out.println(bean.getPassword());
    }
}
