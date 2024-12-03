package com.example.panda_quiz.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_quiz")
@Getter
@Setter
public class UserQuiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_quiz_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @Column(name = "points")
    private Integer points;

    @Column(name = "quiz_date", nullable = false)
    private java.time.LocalDateTime quizDate;
}
