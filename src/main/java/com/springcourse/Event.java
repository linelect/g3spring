package com.springcourse;

import com.springcourse.Logger.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Event {

    public void doEvent() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Logger logger = (Logger)beanFactory.getBean("logger");
        logger.log("Class Event do same event.");
    }
}
