package com.example.greenfoxacademy.reddit.repositories;

import com.example.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
