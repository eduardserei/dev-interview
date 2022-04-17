package com.ews.devinterview.question;

import com.ews.devinterview.answer.Answer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String text;

    public Question() {}

    public Question(String text, List<Answer> answers) {
        this.text = text;
        this.answers = answers;
    }

    @OneToMany(mappedBy = "question")
    private List<Answer> answers = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", answers=" + answers.toString() +
                '}';
    }
}

