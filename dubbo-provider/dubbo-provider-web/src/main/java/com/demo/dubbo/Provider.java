package com.demo.dubbo;

import com.demo.dubbo.dao.HelloDao;
import com.demo.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by mengran.gao on 2017/7/27.
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring/spring-*.xml"});

//        可以取到值的
        HelloService helloService = context.getBean("helloServiceImpl", HelloService.class);
        String sayHi = helloService.sayHi("linlyn-Zhang");
        System.out.println(sayHi);

        HelloDao helloDao = context.getBean("helloDao", HelloDao.class);
        String hello = helloDao.hello();
        System.out.println(hello);

        context.start();

        System.out.println("服务启动成功。。。。。。。。。");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟


    }
}
