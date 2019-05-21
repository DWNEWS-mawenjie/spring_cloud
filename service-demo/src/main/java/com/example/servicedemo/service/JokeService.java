package com.example.servicedemo.service;

import com.example.servicedemo.entity.Joke;
import java.util.Optional;
import org.springframework.data.domain.Page;

/**
 * @ClassName JokeService
 * @Author mawenjie
 * @Date 2019-04-18 16:13
 **/
public interface JokeService {

    Joke save(Joke joke);

    Page<Joke> getJokeList(Integer page, Integer pageSize);

    Optional<Joke> findJoke(String id);
}
