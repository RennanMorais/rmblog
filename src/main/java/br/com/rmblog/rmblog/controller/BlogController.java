package br.com.rmblog.rmblog.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import br.com.rmblog.rmblog.model.Post;
import br.com.rmblog.rmblog.repository.PostRepository;

@Controller
@RequestMapping("/")
public class BlogController {
    
    @Autowired
    PostRepository postRepository;

    @GetMapping
    @ResponseBody
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        
        List<Post> posts = postRepository.findAll();
        mv.addObject("posts", posts);

        return mv;
    }

}
