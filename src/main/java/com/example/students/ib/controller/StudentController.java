package com.example.students.ib.controller;


import com.example.students.ib.models.Student;
import com.example.students.ib.repositories.StudentRepository;
import com.example.students.ib.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
     // student.getName();
       return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){

        return  new ResponseEntity<>(studentService.getStudent(id),HttpStatus.FOUND);
    }

  //  @DeleteMapping("delete/{id}")
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestParam int id, @RequestParam String name){
        return  new ResponseEntity<>(studentService.updateStudent(id,name),HttpStatus.CREATED);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteStudent(@RequestParam int id) {

        return  new ResponseEntity<>(studentService.deleteStudent(id),HttpStatus.CREATED);
    }
}
