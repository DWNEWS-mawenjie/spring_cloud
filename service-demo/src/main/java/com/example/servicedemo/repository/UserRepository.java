package com.example.servicedemo.repository;

import com.example.servicedemo.entity.User;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserRepository
 * @Author mawenjie
 * @Date 2019-04-11 19:15
 **/
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
