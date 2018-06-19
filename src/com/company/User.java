package com.company;

import java.util.Scanner;

/**
 * abstract class User with login and password attributs
 */
class User {

    /**
     * String login and String password
     */
    private String login;
    private String password;


    /**
     * @param userlogin
     * @param userpassword
     */
    public User(String userlogin, String userpassword) {

        this.login = userlogin;
        this.password = userpassword;
    }
}