package com.ews.devinterview.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @GetMapping
    public List<Answer> getAllAnswers(){
        return answerService.getAllAnswers();
    }
}
