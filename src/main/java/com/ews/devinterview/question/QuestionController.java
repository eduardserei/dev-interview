package com.ews.devinterview.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    private List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping
    private Optional<Question> createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }
}
