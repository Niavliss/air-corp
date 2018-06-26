package com.company;

public class Commercial2 extends Admin {

    // TODO private UserList userList;

    public Commercial2(String login, String password) {

        super(login, password);
        // TODO userList = new UserList();

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour créer un utilisateur");
        System.out.println("Choisir 4 pour supprimer un utilisateur");
        System.out.println("Choisir 9 pour sortir ");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 3:
                // TODO createUser();

                break;

            case 4:
                // TODO deleteUser();
                break;

        }
    }

//    public void setUserList(UserList userList) {
//        this.userList = userList;
//    }
//
//    public UserList getUserList() {
//        return userList;
//    }
}
