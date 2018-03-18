package com.baltathon2018.quizes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    private String question;
    private String answer;
//    private Room room;
//    private Topic topic;

}
