package com.tutor.lesson.inheritance;

public class People {
    protected String name;
    protected int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age++;
    }
}
