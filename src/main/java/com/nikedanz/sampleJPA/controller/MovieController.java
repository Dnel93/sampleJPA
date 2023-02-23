package com.nikedanz.sampleJPA.controller;

import com.nikedanz.sampleJPA.persistance.entity.Movie;
import com.nikedanz.sampleJPA.persistance.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class MovieController {
  
  @Autowired
  MovieRepository movieRepository;
  
  @GetMapping("/movie")
  public ResponseEntity<List<Movie>> getMovie() {
    
    List<Movie> movies = movieRepository.findByTitleContaining("Al");
    //List<Movie> movies = movieRepository.findByRatingContaining("13");
    
    return ResponseEntity.ok(movies);
  }
}
