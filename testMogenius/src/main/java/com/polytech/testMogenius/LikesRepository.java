package main.java.com.polytech.testMogenius;

import main.java.com.polytech.testMogenius.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends JpaRepository <Integer> {
    Integer getNbLikes();
    void addLike();
}
