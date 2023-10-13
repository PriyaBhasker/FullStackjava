package com.example.students.ib.service;

import com.example.students.ib.models.Card;
import com.example.students.ib.models.Cardstatus;
import com.example.students.ib.models.Student;
import com.example.students.ib.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public  String addStudent(Student student){
       Card card = new Card();
       card.setCardStatus(Cardstatus.Activated);
       card.setDues(4500);
       student.setCard(card);
       card.setStudentVariableName(student);
        studentRepository.save(student);
        return "Student added";

    }
    public  Student getStudent(int id){
        Student student = studentRepository.findById(id).get();
        return student;
    }
    public Student updateStudent(int id, String name){
        Student student = studentRepository.findById(id).get();
        student.setName(name);
        return studentRepository.save(student);

    }
    public String deleteStudent(int id){
        studentRepository.deleteById(id);
        return "student deleted";
    }
}

