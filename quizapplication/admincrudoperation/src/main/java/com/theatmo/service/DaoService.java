package com.theatmo.service;

import com.theatmo.model.Quiz;

public interface DaoService {
    boolean questionInsert(int choice, Quiz quizTools, int roundNumber);

    boolean checkQuestionNumber(int questionNumber, int roundNumber);

    boolean deleteQuestion(int questionNumber, int roundNumber);
}
