package com.example.students.ib.repositories;

import com.example.students.ib.models.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity,Integer> {

}
