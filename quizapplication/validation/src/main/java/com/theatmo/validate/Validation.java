package com.theatmo.validate;

public class Validation {

    /**
     * Validate user name
     */
    public boolean validateName(final String name) {
        return name.matches("[A-Z][a-zA-Z\\s]*$") ? true : false;
    }

    /**
     * Validate user email
     */
    public boolean validateEmail(final String email) {
        return email.matches("^[A-Za-z0-9_-]*@[^-][A-Za-z0-9-]*(\\.[A-Za-z]{2,3})$") ? true : false;
    }

    /**
     * Validate user password
     */
    public boolean validatePassword(final String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$") ? true : false;
    }

    /**
     * Check correctAnswer
     *
     * @param correctAnswer
     */
    public boolean checkAnswer(final String correctAnswer) {
        return ("a".equalsIgnoreCase(correctAnswer) || "b".equalsIgnoreCase(correctAnswer) || "c".equalsIgnoreCase(correctAnswer) || "d".equalsIgnoreCase(correctAnswer)) ? true : false;
    }

    /**
     * Check firstOption
     *
     * @param firstOption
     */
    public boolean checkFirstOption(final String firstOption) {
        return firstOption.matches("[a]{1}[.]{1}[a-zA-Z0-9\\s]{1,}") ? true :false;
    }

    /**
     * Check secondOption
     *
     * @param secondOption
     */
    public boolean checkSecondOption(final String secondOption) {
        return secondOption.matches("[b]{1}[.]{1}[a-zA-Z0-9\\s]{1,}") ? true : false;
    }

    /**
     * Check thirdOption
     *
     * @param thirdOption
     */
    public boolean checkThirdOption(final String thirdOption) {
        return thirdOption.matches("[c]{1}[.]{1}[a-zA-Z0-9\\s]{1,}") ? true : false;
    }

    /**
     * Check fourthOption
     *
     * @param fourthOption
     */
    public boolean checkFourthOption(final String fourthOption) {
        return fourthOption.matches("[d]{1}[.]{1}[a-zA-Z0-9\\s]{1,}") ? true : false;
    }

    /**
     * Validate Mark
     *
     * @param mark
     * @param answer
     * @param correctAnswer
     */
    public static int markCalculation(int mark, String answer, String correctAnswer) {

        if (correctAnswer.equalsIgnoreCase(answer)) {
            mark = mark+2;
        } else {
            mark = mark-1;
        }
        return mark;
    }

    /**
     * Check mark pass or fail
     *
     * @param mark
     * @param email
     */
    public static boolean checkMark(int mark, final String email) {

        if (mark <= 6) {
            return false;
        } else {
            return true;
        }
    }
}


