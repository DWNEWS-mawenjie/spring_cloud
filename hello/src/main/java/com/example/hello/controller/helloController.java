package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName helloController
 * @Author mawenjie
 * @Date 2019-07-01 10:53
 **/
@RestController
@RequestMapping("hello")
public class helloController {

    @GetMapping("/")
    public String writeWord() {
        return "hello world";
    }
}
