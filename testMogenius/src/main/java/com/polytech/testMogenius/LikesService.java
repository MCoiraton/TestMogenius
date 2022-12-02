package com.polytech.testMogenius;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService{
    
    @Autowired
    private LikesRepository likesRepository;

    public Integer getNbLikes (){
        return likesRepository.getNbLikes();
    }

    public void addLike(){
        likesRepository.addLike();
    }
}