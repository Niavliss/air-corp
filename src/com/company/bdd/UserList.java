package com.company.bdd;

import com.company.profils.Customer;

import java.util.HashMap;

public class UserList {

    private HashMap<String, Customer> listUser;

    public UserList() {

        listUser = new HashMap<>();

        Customer michou = new Customer("Jean Michou", "jeanmich", 1200);
        Customer mikeline = new Customer("Mikeline", "bongour", 30);
        Customer roberte = new Customer("Mr.Roberte", "rorodu69", 450);
        Customer paula = new Customer("Paula Miguel", "paupau", 5000);
        Customer ryu = new Customer("Ryu", "riri", 325);

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

    public void addUser(String login, String password, double budjetCustomer){

        Customer newUser = new Customer(login, password, budjetCustomer);
        this.listUser.put(login, newUser);
    }


}