package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
@ComponentScan
//@Configuration
public class Main {


    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(Main.class);
        for(String bean :applicationContext.getBeanDefinitionNames()){
            System.out.println(bean);
        }
//        Car car = applicationContext.getBean("car" ,Car.class);
//        car.getMotor().start();

    }
}