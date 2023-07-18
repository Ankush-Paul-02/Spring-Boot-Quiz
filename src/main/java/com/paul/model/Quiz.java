package com.paul.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity(name = "Quiz")
@Table
public class Quiz {

    @Id
    @SequenceGenerator(
            name = "quiz_sequence",
            sequenceName = "quiz_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quiz_sequence"
    )
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;
}
