package controller;

import model.DBConnection;
import model.Passenger;
import view.User;

import java.sql.Connection;

public class UserDAO implements User {
    @Override
    public boolean registration(Passenger passenger) {
        boolean result = false;
        try{
            Connection connection = DBConnection.getConnection();
            String query = "insert into ";
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
