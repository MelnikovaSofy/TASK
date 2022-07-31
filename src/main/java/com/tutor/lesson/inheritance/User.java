package com.tutor.lesson.inheritance;

public class User extends People{
    protected String login;

    public String getLogin(){
        return name;
    }

    public void setLogin(String login){
        this.login = login;
    }

    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", age" + age +
                ", login='" + login + '\'' +
                '}';
    }
}
