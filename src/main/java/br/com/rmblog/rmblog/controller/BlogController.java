package br.com.rmblog.rmblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.rmblog.rmblog.model.Post;
import br.com.rmblog.rmblog.repository.PostRepository;

@Controller
@RequestMapping("/")
public class BlogController {
    
    @Autowired
    PostRepository postRepository;

    @GetMapping
    @ResponseBody
    public List<Post> getPosts() {
        List<Post> posts = postRepository.findAll();
        return posts;
    }

}
