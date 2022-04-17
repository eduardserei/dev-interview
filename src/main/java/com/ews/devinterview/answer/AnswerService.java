package com.ews.devinterview.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping
    public List<Answer> getAllAnswers(){
        return answerRepository.findAll();
    }
}
