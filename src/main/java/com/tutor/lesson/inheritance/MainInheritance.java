package com.tutor.lesson.inheritance;

public class MainInheritance {
    public static void main(String[] args){
        User user = new User();
        user.name = "name";
        user.age = 12;
        user.login = "login";
        System.out.println(user);
        user.setLogin("new login");

    }
}
