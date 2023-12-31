package com.example.students.ib.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="id_card")
@Entity

public class Card {
    @Id
   // @GeneratedValue(strategy = GenerationType.UUID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="card_id")
    private int id;

    @Column(name="card_status")
    @Enumerated(value = EnumType.STRING)
    private Cardstatus cardStatus;

    @Column(name = "dues")
    private int dues;

    @OneToOne
    @JoinColumn
    private Student studentVariableName;
//    @OneToOne
//    @JoinColumn(name = "student_id")
//    private Student student;
}