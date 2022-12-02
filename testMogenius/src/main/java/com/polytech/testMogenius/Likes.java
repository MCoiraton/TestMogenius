package com.polytech.testMogenius;
import javax.persistence.Entity;

@Entity
public class Likes{
    private Integer nbLikes;
    
    public Integer getNbLikes(){
        return nbLikes;
    }

    public void setNbLikes(Integer nbLikes){
        this.nbLikes=nbLikes;
    }

    public void addLike(){
        this.nbLikes+=1;
    }
}

