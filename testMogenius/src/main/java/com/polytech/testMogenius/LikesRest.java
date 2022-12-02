package main.java.com.polytech.testMogenius;

import main.java.com.polytech.testMogenius.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LikesRest {
    @Autowired
    private LikesService likesService;

    @GetMapping(path="/Addlike")
    public void addLike(){
        likesService.addLike();
    }

    @GetMapping(path="/likes")
    public Integer getNbLikes(){
        likesService.getNbLikes();
    }

}
