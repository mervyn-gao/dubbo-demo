package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.service.HelloService;

/**
 * Created by mengran.gao on 2017/7/24.
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    public String sayHi(String name) {
        return "Hello ," + name;
    }
}
