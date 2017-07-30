package com.demo.dubbo;

import com.demo.dubbo.controller.HelloController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mengran.gao on 2017/7/27.
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/spring-*.xml"});
        HelloController helloController = context.getBean("helloController", HelloController.class);
        helloController.hello();
    }
}
