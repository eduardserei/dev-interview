package com.ews.devinterview.question;

import com.ews.devinterview.answer.Answer;
import com.ews.devinterview.answer.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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
        this.saveAnswers(question);
        return questionRepository.findById(question.getId());
    }

    public void saveAnswers(Question question) {
        List<Answer> answers = question.getAnswers();
        if(answers == null || answers.isEmpty()){
            return;
        }
        for (Answer answer : answers) {
            answer.setQuestion(question);
        }
        answerRepository.saveAll(answers);
    }

    public Question addAnswer(Long questionId ,Answer answer) {
        Optional<Question> question = questionRepository.findById(questionId);
        if (question.isEmpty()){
            throw new RuntimeException("no question found with id: " + questionId);
        }
        Question foundQuestion = questionRepository.getById(questionId);
        answer.setQuestion(foundQuestion);
        answerRepository.save(answer);
        return foundQuestion;
    }
}
