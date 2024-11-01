package com.twitter.twitterapp;

import com.twitter.twitterapp.repository.MessageRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude = {ThymeleafAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.twitter.twitterapp.repository")
public class TwitterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitterAppApplication.class, args);

    }
}
