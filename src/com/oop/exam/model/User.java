package com.oop.exam.model;

public class User
{
    String username;
    String correo;

    public User(String userName, String correo)
    {
        this.userName = userName;
        this.correo = correo;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getUsername()
    {
        return (username);
    }
}
