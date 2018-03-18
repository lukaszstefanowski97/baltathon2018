package com.baltathon2018.quizes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizes/")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/offline-mode")
    public OfflineQuiz getOfflineQuiz() {
        OfflineQuiz quiz = quizService.createOfflineQuiz();
        return quiz;
    }


}
