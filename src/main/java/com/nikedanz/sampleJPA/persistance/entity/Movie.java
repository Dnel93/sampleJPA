package com.nikedanz.sampleJPA.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie {
  @Id
  private Long id;
  private String title;
  private String director;
  private String rating;
  private int duration;
}
