package com.company.bdd;

import com.company.profils.Customer;

import java.util.HashMap;

public class UserList {

    private HashMap<String, Customer> listUser;

    public UserList() {

        listUser = new HashMap<>();

        Customer michou = new Customer("Jean Michou", "jeanmich", 0);
        Customer mikeline = new Customer("Mikeline", "bongour", 0);
        Customer roberte = new Customer("Mr.Roberte", "rorodu69", 0);
        Customer paula = new Customer("Paula Miguel", "paupau", 0);
        Customer ryu = new Customer("Ryu", "riri", 0);

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

    public void addUser(String login, String password, double billtCustomer){

        Customer newUser = new Customer(login, password, billtCustomer);
        this.listUser.put(login, newUser);
    }


}
