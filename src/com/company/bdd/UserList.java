package com.company.bdd;

import com.company.profils.Customer;

import java.util.HashMap;

public class UserList {

    private HashMap<String, Customer> listUser;

    public UserList() {

        listUser = new HashMap<>();

        Customer michou = new Customer("Jean Michou", "jeanmich");
        Customer mikeline = new Customer("Mikeline", "bongour");
        Customer roberte = new Customer("Mr.Roberte", "rorodu69");
        Customer paula = new Customer("Paula Miguel", "paupau");
        Customer ryu = new Customer("Ryu", "riri");

        this.listUser.put(michou.getLogin(), michou);
        this.listUser.put(mikeline.getLogin(), mikeline);
        this.listUser.put(roberte.getLogin(), roberte);
        this.listUser.put(paula.getLogin(), paula);
        this.listUser.put(ryu.getLogin(), ryu);

    }

    public HashMap<String, Customer> getlistUser() {

        return listUser;

    }

    @Override
    public String toString() {

        String result = "";

        for (String login : listUser.keySet()) {

            Customer u = listUser.get(login);
            result += u.toString() + "\n";

        }
        return result;
    }

    public void deleteUser(String choice) {
        this.listUser.remove(choice);

    }

    public void addUser(String login, String password){

        Customer newUser = new Customer(login, password);
        this.listUser.put(login, newUser);
    }


    public void updateUser(String login, String password, int usertype) {

        Customer u =this.listUser.get(login);
        u.setLogin(login);
        u.setPassword(password);
        u.setType(usertype);

        this.listUser.replace(login, u);
    }
}
