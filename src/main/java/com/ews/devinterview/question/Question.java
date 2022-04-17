package com.ews.devinterview.question;

import com.ews.devinterview.answer.Answer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String text;

//    @OneToMany(
//            mappedBy = "question",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Answer> answers = new ArrayList<>();

    public Question(){}

    public Long getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
//                ", answers=" + answers.toString() +
                '}';
    }
}

