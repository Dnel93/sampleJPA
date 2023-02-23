package com.nikedanz.sampleJPA.persistance.repository;

import com.nikedanz.sampleJPA.persistance.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
  List<Movie> findByTitleContaining(String title);
  List<Movie> findByRatingContaining(String rating);
}
