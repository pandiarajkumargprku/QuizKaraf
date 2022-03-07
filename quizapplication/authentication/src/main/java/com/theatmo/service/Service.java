package com.theatmo.service;

import com.theatmo.model.User;

public interface Service {
    boolean checkEmail(int choice, String email);

    boolean checkPassword(int choice, String password);

    boolean insertSignUpDetail(int choice, User user);
}
