package com.theatmo.controller;

import com.theatmo.model.Quiz;
import com.theatmo.service.Service;
import com.theatmo.service.ServiceImplements;

import java.util.List;

public class QuizController {

    private static final Service QUIZ_DAO_SERVICE = new ServiceImplements();

    /**
     * All level questions get from the database
     *
     * @param level
     */
    public static List<Quiz> getRoundDetails(final int level) {
        return QUIZ_DAO_SERVICE.getRoundDetails(level);
    }

    /**
     * User mark insert in to database
     *
     * @param mark
     * @param email
     */
    public static boolean markInsert(final int mark, final String email) {
        return QUIZ_DAO_SERVICE.markInsert(mark, email);
    }
}
