package com.oop.exam.model;

public class User
{
    String username;
    String correo;

    public User(String userName, String correo)
    {
        this.username = userName;
        this.correo = correo;
    }

    public String getUserName()
    {
        return username;
    }

    public String getUsername()
    {
        return (username);
    }
}
