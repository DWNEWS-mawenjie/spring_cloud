package com.example.servicedemo.controller;

import com.example.servicedemo.entity.User;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName userController
 * @Author mawenjie
 * @Date 2019-04-19 15:55
 **/
@RestController
@RequestMapping("/user")
public class userController {

    @GetMapping("/generate")
    public String generateToken(@RequestParam("appid") String appId,
        @RequestParam("secret") String secret, @RequestParam("code") String code) throws Exception {

        String uri =
            "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + secret
                + "&js_code=" + code + "&grant_type=authorization_code";

        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader responseReader = new BufferedReader(
            new InputStreamReader(connection.getInputStream(), "UTF-8"));
        System.out.println(responseReader.readLine());

        return "success";
    }

    @PostMapping
    public User checkUserInfo(@RequestBody User user) {
        return null;
    }
}
