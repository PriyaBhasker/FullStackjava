package com.example.students.ib.service;

import com.example.students.ib.DTO.BookDTO;
import com.example.students.ib.models.AuthorEntity;
import com.example.students.ib.models.BookEntity;
import com.example.students.ib.repositories.AuthorRepo;
import com.example.students.ib.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    AuthorRepo authorRepo;

    public String addBook(BookDTO bookDTO){
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(bookDTO.getName());
        bookEntity.setGenre(bookDTO.getGenre());
        bookEntity.setPages(bookDTO.getPages());
        AuthorEntity author = authorRepo.findById(bookDTO.getAuthorId()).get();
        bookEntity.setAuthor(author);
        List<BookEntity> bookList = new ArrayList<>();
        bookList.add(bookEntity);
        author.setBookList(bookList);
        authorRepo.save(author);
        return "book saved";
    }

    public AuthorEntity addAuthor(AuthorEntity author){
        return authorRepo.save(author);
    }


}
