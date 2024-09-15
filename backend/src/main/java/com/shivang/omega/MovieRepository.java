package com.shivang.omega;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { //bringing the data from our database and is linked through the code in ApplicationContext
    //it contains methods like findAll
    Optional<Movie> findByImdbId(String imdbId); //springboot is smart enough to understand what we have done
}
