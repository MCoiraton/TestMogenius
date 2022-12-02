package com.polytech.testMogenius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LikesRest {
    @Autowired
    private LikesRepository likesRepository;

    @PostMapping(path="/Addlike")
    public void addLike(){
        likesRepository.addLike();
    }

    @GetMapping(path="/")
    public Integer getNbLikes(){
        return likesRepository.getNbLikes();
    }

}
