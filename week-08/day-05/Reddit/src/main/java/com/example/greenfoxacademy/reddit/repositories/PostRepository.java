package com.example.greenfoxacademy.reddit.repositories;

import com.example.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
  List<Post> findAllByOrderByVoteNumberDesc();
}
