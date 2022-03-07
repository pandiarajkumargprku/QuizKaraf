package com.theatmo.controller;

import com.theatmo.model.Quiz;
import com.theatmo.service.DaoService;
import com.theatmo.service.DaoServiceImplements;

public class CrudController {

    private static final DaoService DAO_SERVICE = new DaoServiceImplements();

    /**
     * Questions insert, update into databse
     *
     * @param choice
     * @param QuizTools
     */
    public static boolean questionInsert(final int choice, final Quiz QuizTools, final int roundNumber) {
        return DAO_SERVICE.questionInsert(choice, QuizTools, roundNumber);
    }

    /**
     * Questions delete from databse
     *
     * @param questionNumber
     */

    public static boolean checkQuestionNumber(final int questionNumber, final int roundNumber) {
        return DAO_SERVICE.checkQuestionNumber(questionNumber, roundNumber);
    }

    /**
     * delete Questions
     * @param questionNumber
     * @param roundNumber
     */
    public static boolean deleteQuestion(final int questionNumber, int roundNumber) {
        return DAO_SERVICE.deleteQuestion(questionNumber, roundNumber);
    }
}
