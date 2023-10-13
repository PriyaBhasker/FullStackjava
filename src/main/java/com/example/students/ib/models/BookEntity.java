package com.example.students.ib.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String genre;
    private int pages;
    private String name;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
}
