package com.example.servicedemo.service;

import com.example.servicedemo.entity.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Author mawenjie
 * @Date 2019-04-11 19:10
 **/
public interface UserService {

  List<User> findAllUser();

  User save(User user);
}
