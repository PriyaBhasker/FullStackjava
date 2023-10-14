package com.example.students.ib.controller;


import com.example.students.ib.DTO.BookDTO;
import com.example.students.ib.models.AuthorEntity;
import com.example.students.ib.models.BookEntity;
import com.example.students.ib.models.Student;
import com.example.students.ib.repositories.BookRepo;
import com.example.students.ib.service.BookService;
import com.example.students.ib.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/book")
public class BooksController {

    @Autowired
    BookService bookService;
    @Autowired
    BookRepo bookRepo;

    @PostMapping("/add")
    public String addBook(@RequestBody BookDTO book) {
        return bookService.addBook(book);
    }

    @PostMapping("/addAuthor")
    public AuthorEntity addAuthor(@RequestBody AuthorEntity author) {
        return bookService.addAuthor(author);
    }

    @GetMapping("/get/{id}")
    public BookEntity getBook(@PathVariable int id) {
        return bookRepo.findById(id).get();

    }

}

