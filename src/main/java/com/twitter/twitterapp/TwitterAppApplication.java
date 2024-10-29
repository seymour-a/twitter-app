package com.twitter.twitterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;


@SpringBootApplication(exclude = {ThymeleafAutoConfiguration.class})
public class TwitterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitterAppApplication.class, args);
    }


}
