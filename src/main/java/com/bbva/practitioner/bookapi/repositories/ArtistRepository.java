package com.bbva.practitioner.bookapi.repositories;

import com.bbva.practitioner.bookapi.entities.Artist;
import com.bbva.practitioner.bookapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
