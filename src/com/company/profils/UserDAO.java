package com.company.profils;

import com.company.BddConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAO {

    protected Connection connect = null;

    private User user;

    public UserDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(User obj) {
        return false;
    }

    public boolean delete(User obj) {
        return false;
    }

    public boolean update(User obj) {
        return false;
    }

    public User find() {


//        try {

//            ResultSet result = this.connect.createStatement(
//                    ResultSet.TYPE_SCROLL_INSENSITIVE,
//                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM listuser WHERE idUser = '?' ");

            Scanner sc = new Scanner(System.in);
            System.out.println("Utilisateur,  commercial, marketing manager ? u/c/m");
            String type = sc.nextLine();

//            if (result.first())

                // si l'utilisateur choisi u:
                if (type.equals("u")) {


                    System.out.println("Veuillez saisir votre login ");
                    String login = sc.nextLine();

                    System.out.println("Veuillez saisir votre mot de passe ");
                    String password = sc.nextLine();

                    UserDAO userDao = new UserDAO(BddConnection.getInstance());
                    User user = new Customer(login, password);

                    userDao.create(user);
                }

                // si l'utilisateur choisi c
                else if (type.equals("c")) {
                    System.out.println("Veuillez saisir votre login de commercial");
                    String login = sc.nextLine();

                    System.out.println("Veuillez saisir votre mot de passe commercial");
                    String password = sc.nextLine();

                    System.out.println("Commercial de niveau 1 ou Commercial de niveau 2 ?");
                    String moderator = sc.nextLine();

                    // si l'utilisateur choisi 1
                    if (moderator.equals("1")) {

                        UserDAO userDao = new UserDAO(BddConnection.getInstance());
                        User user = new Admin(login, password, "1");

                        userDao.create(user);

                    }
                    // si l'utilisateur choisi 2
                    else if (moderator.equals("2")) {

                        UserDAO userDao = new UserDAO(BddConnection.getInstance());
                        User user = new Admin(login, password, "2");

                        userDao.create(user);

                    }
                }

                // si l'utilisateur choisi m
                else if (type.equals("m")) {

                    System.out.println("Veuillez saisir votre login ");
                    String login = sc.nextLine();

                    System.out.println("Veuillez saisir votre mot de passe ");
                    String password = sc.nextLine();

                    UserDAO userDao = new UserDAO(BddConnection.getInstance());
                    User user = new Marketing(login, password);

                    userDao.create(user);

                }

//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        return user;
    }


//    public User getData(String type) {
//
//
//
//    }


}
