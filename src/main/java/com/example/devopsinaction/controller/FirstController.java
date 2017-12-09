package com.example.devopsinaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张浩
 * @version 1.0 2017/12/09.
 */

@RestController
public class FirstController {
    @RequestMapping("/")
    public String helloDevOps() {
        return "Hello DevOps1111!";
    }
}
