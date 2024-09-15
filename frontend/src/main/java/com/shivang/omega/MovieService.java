package com.shivang.omega;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService { //this is the implementation of data fetched in MovieRepository

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() { //a method that we'll use instead of findAll
        return movieRepository.findAll(); //method fetched from MongoRepository
    }


    public Optional<Movie> singleMovie(String imdb){ //optional because the Id may not even exist then in that case the error will be caught
        return movieRepository.findByImdbId(imdb);
    }
}
