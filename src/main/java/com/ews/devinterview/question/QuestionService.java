package com.ews.devinterview.question;

import com.ews.devinterview.answer.Answer;
import com.ews.devinterview.answer.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    public QuestionRepository questionRepository;

    @Autowired
    public AnswerRepository answerRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Question> createQuestion(Question question) {
        questionRepository.save(question);
        return questionRepository.findById(question.getId());
    }
}
