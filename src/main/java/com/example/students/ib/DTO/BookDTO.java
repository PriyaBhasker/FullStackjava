package com.example.students.ib.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String genre;

    private int pages;

    private String name;

    private int authorId;
}
