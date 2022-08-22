package com.bbva.practitioner.bookapi;

import com.bbva.practitioner.bookapi.entities.Book;
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
  CommandLineRunner preloadDatabase(BookRepository repository) {
    return (args) -> {
      this.logger.info("Preloading books in database...");
      Book book1 = new Book(
              "El Aleph",
              "...",
              1949,
              "Argentina"
      );
      repository.save(book1);
      Book book2 = new Book(
              "Rayuela",
              "...",
              1963,
              "Argentina"
      );
      repository.save(book2);
      this.logger.info("Books preloaded to database");
    };
  }
}
