package com.paul.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Question")
@Table
public class Question {

    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String answer;
    private String difficultylevel;
}
