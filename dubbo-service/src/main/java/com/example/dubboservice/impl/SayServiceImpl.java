package com.example.dubboservice.impl;

import com.example.service.SayService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SayServiceImpl implements SayService {
    @Override
    public String sayHelloByName(String name) {
        return name+",hello1!";
    }
}

