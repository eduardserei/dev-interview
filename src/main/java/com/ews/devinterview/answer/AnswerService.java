package com.ews.devinterview.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> getAllAnswers(){
        return answerRepository.findAll();
    }

    public void createAnswer(Answer answer){
        answerRepository.save(answer);
    }
}
