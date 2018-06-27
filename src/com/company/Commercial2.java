//package com.company;
//
//import java.util.Scanner;
//
//public class Commercial2 extends Admin {
//
//    private UserList userList;
//
//    public Commercial2(String login, String password) {
//
//        super(login, password);
//        // TODO userList = new UserList();
//
//    }
//
//    public void displayMenu() {
//        super.displayMenu();
//        System.out.println("Choisir 3 pour aficher la liste des utilisateurs");
//        System.out.println("Choisir 4 pour créer un utilisateur");
//        System.out.println("Choisir 5 pour supprimer un utilisateur");
//        System.out.println("Choisir 9 pour sortir ");
//    }
//
//    public void exec(int reponse) {
//        switch (reponse) {
//
//            case 3:
//                displayUserList();
//
//                break;
//
//            case 4:
//                createUser();
//
//                break;
//
//            case 5:
//                deleteUser();
//                break;
//
//        }
//    }
//
//
//
//
//    public void setUserList(UserList userList) {
//        this.userList = userList;
//    }
//
//    public UserList getUserList() {
//        return userList;
//    }
//
//    public void displayUserList() {
//
//        System.out.println(this.userList);
//
//    }
//
//    public void createUser() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Veuillez saisir le login de l'utilisateur");
//        // TODO ProductId idProduct = new ProductId(sc.nextInt());
//        String userLogin = sc.next();
//
//        System.out.println("Veuillez saisir le mot de passe de l'utilisateur");
//        String userPassword = sc.next();
//
//        System.out.println("Veuillez saisir le budjet de l'utilisateur");
//        Double userBudjet = sc.nextDouble();
//
//        userList.addUser(userLogin, userPassword, userBudjet);
//        System.out.println(this.userList);
//    }
//
//    public void deleteUser() {
//
//        System.out.println(this.userList);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Veuillez saisir le login de l'utilisateur à supprimer ");
//        String userLogin = sc.next();
//
//
//        userList.deleteUser(userLogin);
//        System.out.println(this.userList);
//
//    }
//
//
//}
