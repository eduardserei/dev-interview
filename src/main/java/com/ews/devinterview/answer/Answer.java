package com.ews.devinterview.answer;

import com.ews.devinterview.question.Question;

import javax.persistence.*;

@Entity
@Table
public class Answer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String text;

    public Answer() {}

    public Answer(String text) {
        this.text = text;
    }

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", question=" + question +
                '}';
    }
}
