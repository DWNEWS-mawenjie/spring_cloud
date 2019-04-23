package com.example.servicedemo.repository;

import com.example.servicedemo.entity.Joke;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName JokeRepository
 * @Author mawenjie
 * @Date 2019-04-18 16:12
 **/
public interface JokeRepository extends MongoRepository<Joke, String> {

}
