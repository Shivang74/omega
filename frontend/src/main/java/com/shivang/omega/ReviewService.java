package com.shivang.omega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    MongoTemplate mongoTemplate; //to push right review at right place we need a template

    public Review createReview(String imdbId, String reviewBody){ //fitting reviews through imdbId
      //  Review review = new Review(reviewBody); //creating a review as per template Review class
       // reviewRepository.insert(review); //inserting review in database

        Review review = reviewRepository.insert(new Review(reviewBody)); //modified above statements

        mongoTemplate.update(Movie.class) //updating Movie class
                .matching(Criteria.where("imdbId").is(imdbId)) //matching imdbIds
                .apply(new Update().push("reviewIds").value(review))//pushing right reviews at right imdbId
                .first();//making sure that review is inserted in the first matched imdbId only and not in all below

        return review;
    }
}
