package com.company;


/**
 * abstract class User with login and password attributs
 */
class User {

    /**
     * String login and String password
     */
    String login;
    String password;

    /**
     * @param userlogin
     * @param userpassword
     */
    public User(String userlogin, String userpassword) {

        this.login = userlogin;
        this.password = userpassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}