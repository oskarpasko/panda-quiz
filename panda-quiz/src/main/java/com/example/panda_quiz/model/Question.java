package com.example.panda_quiz.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "question")
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "correct_answer", nullable = false)
    private String correctAnswer;

    @Column(name = "bad_answer1", nullable = false)
    private String badAnswer1;

    @Column(name = "bad_answer2", nullable = false)
    private String badAnswer2;

    @Column(name = "bad_answer3", nullable = false)
    private String badAnswer3;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;
}
