package com.theironyard.librarymanager.services;

import com.theironyard.librarymanager.entities.Author;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MapAuthorService implements AuthorService {
    private Map<Integer, Author> authors;

    public MapAuthorService() {
        authors = new HashMap<>();
    }

    @Override
    public List<Author> listAllAuthors() {
        return null;
    }

    @Override
    public void createSampleAuthors() {
        Author author1 = new Author(1, "Kathy Sierra");
        authors.put(1, author1);

        Author author2 = new Author(2, "James Gosling");
        authors.put(2, author2);

        Author author3 = new Author(3, "Joshua Bloch");
        authors.put(3, author3);
    }
}
