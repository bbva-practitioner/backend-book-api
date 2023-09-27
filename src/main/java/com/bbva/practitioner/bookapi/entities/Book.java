package com.bbva.practitioner.bookapi.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @NonNull
  private String title;

  private String description;

  private Integer publicationYear;

  private String country;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
  }

  public String getCountry() {
    return country;
  }

  @OneToOne
  @JoinColumn(name="book_id")
  private Artist artist;

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }


  public void setCountry(String country) {
    this.country = country;
  }

  public Book() {
  }

  public Book(String title, String description, Integer publicationYear, String country, Artist artist) {
    this.title = title;
    this.description = description;
    this.publicationYear = publicationYear;
    this.country = country;
    this.artist = artist;
  }
}
