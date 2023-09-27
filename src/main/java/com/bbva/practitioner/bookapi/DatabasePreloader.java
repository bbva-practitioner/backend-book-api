package com.bbva.practitioner.bookapi;

import com.bbva.practitioner.bookapi.entities.Artist;
import com.bbva.practitioner.bookapi.entities.Book;
import com.bbva.practitioner.bookapi.repositories.ArtistRepository;
import com.bbva.practitioner.bookapi.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabasePreloader {
  private static Logger logger = LoggerFactory.getLogger(DatabasePreloader.class);

  @Bean
  CommandLineRunner preloadDatabase(BookRepository books, ArtistRepository artists) {
    return (args) -> {
      this.logger.info("Preloading books artists...");
      Artist borges = new Artist(
              "Jorge Luis",
              "Borges",
              1899
      );
      artists.save(borges);
      this.logger.info("Artists preloaded to database...");
      this.logger.info("Preloading books artists...");
      Book book1 = new Book(
              "El Aleph",
              "...",
              1949,
              "Argentina",
              borges
      );
      books.save(book1);
      Book book2 = new Book(
              "Ficicones",
              "...",
              1944,
              "Argentina",
              borges
      );
      books.save(book2);
      this.logger.info("Books preloaded to database");


    };
  }
}
