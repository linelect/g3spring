package com.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Event event = (Event)beanFactory.getBean("event");
        event.doEvent();
    }
}
