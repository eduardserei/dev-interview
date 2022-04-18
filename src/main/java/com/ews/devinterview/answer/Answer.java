package com.ews.devinterview.answer;

import com.ews.devinterview.question.Question;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String text;

    @ManyToOne(targetEntity = Question.class)
    private Question question;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
