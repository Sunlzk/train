package com.lzk.train.member.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * @description TODO
 * @date 2023/11/22 20:53
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String getMsg(){
        return "hello";
    }
}
