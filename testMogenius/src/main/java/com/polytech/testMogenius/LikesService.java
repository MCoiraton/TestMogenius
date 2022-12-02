package main.java.com.polytech.testMogenius;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.com.polytech.testMogenius.Likes;
import main.java.com.polytech.testMogenius.LikesRepository;

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