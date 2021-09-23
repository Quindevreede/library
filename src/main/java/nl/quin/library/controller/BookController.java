package nl.quin.library.controller;

import nl.quin.library.exception.RecordNotFoundException;
import nl.quin.library.model.Book;
import nl.quin.library.repository.BookRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/books")
    public ResponseEntity getPersonen() {
        Iterable<Book> books = bookRepository.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping(value = "/books/{nr}")
    public ResponseEntity getBook(@PathVariable long nr) {
        try {
            Optional<Book> book = bookRepository.findById(nr);
            return ResponseEntity.ok(book);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
            throw new RecordNotFoundException();
        }
    }

    @PostMapping(value = "/books")
    public ResponseEntity addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return ResponseEntity.ok("Data Added");
    }

    @DeleteMapping(value = "/books/{nr}")
    public ResponseEntity deleteBook(@PathVariable long nr) {
        bookRepository.deleteById(nr);
        return ResponseEntity.ok("Data Deleted");
    }

    @PutMapping(value = "/books/{nr}")
    public ResponseEntity updateBook(@PathVariable long nr, @RequestBody Book book) {
        return ResponseEntity.ok("Data Updated");
    }

}