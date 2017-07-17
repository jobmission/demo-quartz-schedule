package com.revengemission.schedule.service.impl;

import com.revengemission.schedule.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhang wanchao on 17-7-17.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(Map<String, Object> parameter) {
        parameter.forEach((k, v) -> {
            System.out.println("k = " + k + ",v = " + v);
        });
        return "SUCCESS ";
    }
}
