package com.demo.dubbo.dao;

import org.springframework.stereotype.Component;

/**
 * Created by mengran.gao on 2017/7/28.
 */
@Component
public class HelloDao {

    public String hello() {
        return "Hello World";
    }
}
