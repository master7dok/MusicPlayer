package com.mbdev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

            ClassicMusic classicMusic = context.getBean("typeMusic1", ClassicMusic.class);
        System.out.println(classicMusic.getSong());
        context.close();
    }
}
