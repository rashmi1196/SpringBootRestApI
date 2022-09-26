package com.spring.boot.restAPI.SpringBootRestApI.controller;

import com.spring.boot.restAPI.SpringBootRestApI.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationController {

    @GetMapping("/movies")
    public List<Movie> getAllMovie(){
        return Arrays.asList( new Movie(1, "Hancock",4.5),
                new Movie(2, "IronMan",5),
                new Movie(3, "Avengers", 4.8));
    }
}
