package com.theatmo.service;

import com.theatmo.model.Quiz;

import java.util.List;

public interface Service {

    List<Quiz> getRoundDetails(int level);

    boolean markInsert(int mark, String email);
}
