package com.baltathon2018.quizes;

import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private final QuestionRepository questionRepository;

    public QuizService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public OfflineQuiz createOfflineQuiz() {
//        questionRepository.findAll()

    }
}
