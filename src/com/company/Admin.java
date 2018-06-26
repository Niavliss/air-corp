package com.company;

abstract class Admin extends User {

    protected int moderator;

    public Admin(String login, String password, int commercialmoderator) {

        super(login, password);
        moderator = commercialmoderator;

    }

    public Admin(String login, String password) {

        super(login, password);

    }

    public void setModerator(int moderator) {

        this.moderator = moderator;
    }

    public int getModerator() {

        return moderator;
    }


}
