package com.example.greenfoxacademy.reddit.controllers;

import com.example.greenfoxacademy.reddit.models.Post;
import com.example.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private Post post;
  private PostRepository postRepository;

  @Autowired
  public MainController(Post post, PostRepository postRepository) {
    this.post = post;
    this.postRepository = postRepository;
  }

  @GetMapping(value = "")
  public String indexPage(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }

  @GetMapping(value = "/submit")
  public String submitPage(Model model) {
    model.addAttribute("post", post);
    return "submit";
  }

  @PostMapping(value = {"/submit"})
  public String addNewPost(@ModelAttribute(name = "title") String title,
                           @ModelAttribute(name = "url") String url) {
    postRepository.save(new Post(title, url));
    return "redirect:/";
  }

  @GetMapping(value = "/post/{id}/upvote")
  public String postUpVote(@PathVariable(name = "id") long id) {
    post = postRepository.findById(id).orElse(null);
    if (post == null) {
      return "redirect:/";
    } else {
      post.setVoteNumber(post.getVoteNumber() + 1);
      postRepository.save(post);
      return "redirect:/";
    }
  }
}
