package com.bipul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Car obj=(Car) context.getBean("car1");
        System.out.println(obj);

//        Car obj2 =(Car)context.getBean("car2");
//        System.out.println(obj2);
    }
}
