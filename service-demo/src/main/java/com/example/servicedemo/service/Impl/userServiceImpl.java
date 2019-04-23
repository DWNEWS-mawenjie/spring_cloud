package com.example.servicedemo.service.Impl;

import com.example.servicedemo.entity.User;
import com.example.servicedemo.repository.UserRepository;
import com.example.servicedemo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName userServiceImpl
 * @Author mawenjie
 * @Date 2019-04-11 19:10
 **/
@Service
public class userServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public List<User> findAllUser() {
    return userRepository.findAll();
  }

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }
}
