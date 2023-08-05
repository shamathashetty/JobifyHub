package com.project.joblisting.controller;
import com.project.joblisting.repository.PostRepository;
import com.project.joblisting.model.Post;
import com.project.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class PostController {
    @Autowired //spring will create object for us and it will map it
    PostRepository repo;

    @Autowired
    SearchRepository srepo;
     @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-uri.html");

    }


    @GetMapping("/allposts")
    @CrossOrigin
    public List<Post>getAllPosts(){
        return repo.findAll();

        
    }
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){

      return srepo.findByText(text);
    }
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
         return repo.save(post);
    }
}
