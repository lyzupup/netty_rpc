package com.lyzupup.netty.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: netty_rpc
 * @description: SpringbootApplicationClass
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-17 23:38
 **/
@Controller
@SpringBootApplication
@Configuration
public class Application {

    private static final String HELLO_SPRINGBOOT = "hello springboot!";

    @RequestMapping("springboot")
    @ResponseBody
    public String helloSpringBoot() {
        return HELLO_SPRINGBOOT;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}