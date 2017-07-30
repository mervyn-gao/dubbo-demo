package com.demo.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by mengran.gao on 2017/7/27.
 */
@Component
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    public void hello() {
        String sayHi = helloService.sayHi("mervyn-Gao");
        System.out.println(sayHi);
    }
}
