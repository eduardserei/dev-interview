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
//
//    @ManyToOne
//    @JoinColumn(name = "question_id")
//    private Question question;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", text='" + text + '\'' +
//                ", question=" + question +
                '}';
    }
}
