package com.twitter.twitterapp.repository;

import com.twitter.twitterapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories(basePackages = "com.twitter.twitterapp.repository")
public interface MessageRepo extends JpaRepository<Message, Long> {
    List<Message> findByTag(String tag);
}


