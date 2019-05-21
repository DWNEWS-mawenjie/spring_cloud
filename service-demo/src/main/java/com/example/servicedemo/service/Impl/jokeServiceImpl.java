package com.example.servicedemo.service.Impl;

import com.example.servicedemo.entity.Joke;
import com.example.servicedemo.repository.JokeRepository;
import com.example.servicedemo.service.JokeService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @ClassName jokeServiceImpl
 * @Author mawenjie
 * @Date 2019-04-18 16:13
 **/
@Service
public class jokeServiceImpl implements JokeService {

    @Autowired
    JokeRepository jokeRepository;

    @Override
    public Joke save(Joke joke) {
        return jokeRepository.save(joke);
    }

    @Override
    public Page<Joke> getJokeList(Integer page, Integer pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by("createdAt").descending());
        return jokeRepository.findAll(pageable);
    }

    @Override
    public Optional<Joke> findJoke(String id) {
        return jokeRepository.findById(id);
    }
}
