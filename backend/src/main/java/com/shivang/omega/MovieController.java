package com.shivang.omega;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies") //all mapping requests of /api/v1/movies will be handled by this controller
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){ //just String could also be used but ResponseEntity helps when integrated frontend as HttpStatus.OK will give 200 generated code in terminal that means this controller is working fine!
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK); //using method created by us instead of findAll
    }

    @GetMapping("/{imdb}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdb){ //PathVariable ensures that imdb passed in url is mapped with this variable
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdb),HttpStatus.OK);
    }

}
