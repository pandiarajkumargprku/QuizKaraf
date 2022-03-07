package com.theatmo.service;

import com.theatmo.dao.AuthenticateDao;
import com.theatmo.model.User;

public class ServiceImplements implements Service{

    private static final AuthenticateDao AUTHENTICATE_DAO = new AuthenticateDao();

    /**
     * Check signUp admin or user
     *
     * @param choice
     * @param user
     */
    public boolean insertSignUpDetail(final int choice, final User user)  {
        boolean isSignUp = true;

        if (choice == 1) {
            isSignUp = AUTHENTICATE_DAO.insertAdminSignUpDetails(user);
        } else if (choice == 2) {
            isSignUp = AUTHENTICATE_DAO.insertUserSignUpDetails(user);
        }
        return isSignUp;
    }

    /**
     * Check email
     *
     * @param choice
     * @param email
     */
    public boolean checkEmail(final int choice, final String email) {
        boolean isEmailValid = true;

        if (choice == 1) {
            isEmailValid = AUTHENTICATE_DAO.checkAdminEmail(email);
        } else if (choice == 2) {
            isEmailValid = AUTHENTICATE_DAO.checkUserEmail(email);
        }
        return isEmailValid;
    }

    /**
     * Check password
     *
     * @param choice
     * @param password
     */
    public boolean checkPassword(final int choice, final String password) {
        boolean isPasswordValid = true;

        if (choice == 1) {
            isPasswordValid = AUTHENTICATE_DAO.checkAdminPassword(password);
        } else if (choice == 2) {
            isPasswordValid = AUTHENTICATE_DAO.checkUserPassword(password);
        }
        return isPasswordValid;
    }

}
