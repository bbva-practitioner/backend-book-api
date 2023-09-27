package com.bbva.practitioner.bookapi.controllers;

import com.bbva.practitioner.bookapi.entities.Artist;
import com.bbva.practitioner.bookapi.entities.Book;
import com.bbva.practitioner.bookapi.repositories.ArtistRepository;
import com.bbva.practitioner.bookapi.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    private ArtistRepository repository;

    public ArtistController(ArtistRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Artist> list() {
        return this.repository.findAll();
    }
}
