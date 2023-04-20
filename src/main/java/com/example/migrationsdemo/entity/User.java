package com.example.migrationsdemo.entity;

public class User {

    public Integer id;

    public String username;

    public String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
