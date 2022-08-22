package com.bbva.practitioner.bookapi.controllers;

import com.bbva.practitioner.bookapi.entities.Book;
import com.bbva.practitioner.bookapi.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
  private BookRepository repository;

  public BooksController(BookRepository repository) {
    this.repository = repository;
  }

  @GetMapping()
  public List<Book> listBooks() {
    return this.repository.findAll();
  }
}
