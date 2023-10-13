package com.example.students.ib.repositories;

import com.example.students.ib.models.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity,Integer> {

}
