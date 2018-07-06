//package com.company.profils;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public abstract class MarketingDAO extends Marketing {
//
//    public MarketingDAO (Connection connect) {
//        super(connect);
//    }
//
//    @Override
//    public boolean create(Marketing obj) {
//        return false;
//    }
//
//    @Override
//    public boolean delete(Marketing obj) {
//        return false;
//    }
//
//    @Override
//    public boolean update(Marketing obj) {
//        return false;
//    }
//
//    public Marketing find (int id) {
//        Marketing user = new Marketing();
//
//        try {
//            ResultSet result = this.connect.createStatement(
//                    ResultSet.TYPE_SCROLL_INSENSITIVE,
//                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM userlist WHERE idProduct = ? ");
//            if (result.first())
//                user = new Marketing(
//                        result.getString("login"),
//                        result.getString("password"
//                        ));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return user;
//    }
//
//
//}
