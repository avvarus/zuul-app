package com.example.zuulapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulAppApplication.class, args);
    }

}
