package com.lzk.train.member.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author
 * @version 1.0
 * @description TODO
 * @date 2023/11/22 20:47
 */

@SpringBootApplication
@ComponentScan("com.lzk")
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
