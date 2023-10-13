package com.example.students.ib.service;

import com.example.students.ib.models.BookEntity;
import com.example.students.ib.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public String addBook(BookEntity book){
        bookRepo.save(book);
        return "book saved";
    }


}
