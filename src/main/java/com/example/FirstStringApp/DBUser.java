package com.example.FirstStringApp;

import java.util.ArrayList;
import java.util.List;

public class DBUser {

    private List<User> userTable = new ArrayList<User>();
    public DBUser(){
        userTable.add(new User(1,"Suraj",23));
        userTable.add(new User(2,"Sujan",21));
        userTable.add(new User(3,"Raju",25));

    }

    public List<User> getAllUsers(){
        return userTable;
    }

    public User getAUser(int id){
        for(User user: userTable){
            if(id == user.getId()){
                return user;
            }
        }
        return null;
    }

    public User addUser(User user){
        userTable.add(user);
        return user;
    }

    public boolean deleteUser(int id){
        for(User user: userTable){
            if(id == user.getId()){
                userTable.remove(user);
                return true;
            }
        }
        return false;
    }

}
