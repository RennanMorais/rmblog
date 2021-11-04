package br.com.rmblog.rmblog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.rmblog.rmblog.model.Post;
import br.com.rmblog.rmblog.repository.PostRepository;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BlogController {
    
    @Autowired
    PostRepository postRepository;

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");

        List<Post> posts = postRepository.findAll();
        mv.addObject("posts", posts);

        return mv;
    }

    @GetMapping("news/{id}")
    @ResponseBody
    public ModelAndView news(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("news");

        Post post = postRepository.getById(id);
        mv.addObject("post", post);

        return mv;
    }

}
