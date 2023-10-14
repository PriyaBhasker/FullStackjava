package com.example.students.ib.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//    private String name;
//    private String contact;

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//     private String id;
    //private String name;
//   private String contact;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "contact",unique = true)
    private String contact;

    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;

//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
//    private Card card;
}
