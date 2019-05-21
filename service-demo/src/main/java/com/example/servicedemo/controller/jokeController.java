package com.example.servicedemo.controller;

import com.example.servicedemo.entity.Joke;
import com.example.servicedemo.service.JokeService;
import java.util.Date;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName jokeController
 * @Author mawenjie
 * @Date 2019-04-18 15:42
 **/
@RestController
@RequestMapping("/joke")
public class jokeController {

    @Autowired
    JokeService jokeService;


    @PostMapping
    public Joke saveJoke(@RequestBody Joke joke, HttpServletRequest request) {
        String user = request.getHeader("name");
        if (StringUtils.isEmpty(joke.getImage())) {
            joke.setImage(
                "http://5b0988e595225.cdn.sohucs.com/images/20181020/013df387dbb842aabf5d9b9bab735c88.jpeg");
        }
        joke.setCreatedBy(user);
        joke.setCreatedAt(new Date());
        return jokeService.save(joke);
    }


    @GetMapping("/list")
    public Page<Joke> getJokeList(
        @RequestParam(value = "pageSize", defaultValue = "7") Integer pageSize,
        @RequestParam(value = "page", defaultValue = "0") Integer page) {
        return jokeService.getJokeList(page, pageSize);
    }


    @GetMapping("/{id}")
    public Optional<Joke> getJoke(@PathVariable String id) {
        return jokeService.findJoke(id);
    }
}
