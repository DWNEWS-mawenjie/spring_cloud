package com.example.servicedemo.controller;

import com.example.servicedemo.entity.User;
import com.example.servicedemo.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName helloworld
 * @Author mawenjie
 * @Date 2019-04-11 14:11
 **/
@RestController
@RequestMapping("/test")
public class helloworld {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("/user")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
