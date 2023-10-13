package com.example.students.ib.controller;


import com.example.students.ib.models.BookEntity;
import com.example.students.ib.models.Student;
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

    @PostMapping("/add")
    public String addBook(BookEntity book){
        return bookService.addBook(book);
    }

}