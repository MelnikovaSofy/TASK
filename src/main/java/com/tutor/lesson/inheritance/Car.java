package com.tutor.lesson.inheritance;

import java.util.Objects;

public class Car{
    protected String name;
    protected String brand;
    protected String model;
    protected String color;
    protected int price;
    protected int age;

    protected String bonnet;         //капот
    protected String windscreen;     //лобовое стекло
    protected String boot;           //багажник
    protected int headlight;      //фара
    protected int wheel;          //колесо

    //конструктор, используемый при указании всех полей
    public Car(String myBonnet, String myWindscreen, String myBoot, int myHeadlight, int myWheel)
    {
        bonnet = myBonnet;
        windscreen = myWindscreen;
        boot = myBoot;
        headlight = myHeadlight;
        wheel = myWheel;
    }

    //конструктор, используемый, когда ни одно поле не указано
    public Car()
    {
        bonnet = "Steel";
        windscreen = "Stalinite";
        boot = "Universal";
        headlight = 8;
        wheel = 4;
    }

    //конструктор, используемый, при аварии автомобиля
    public Car(int newHeadlight, int newWheel)
    {
        headlight = newHeadlight;
        wheel = newWheel;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color) { this.color = color; }

    public int getAge(){
        return age;
    }
    public int getPrice(){
        return price;
    }


    public void setAge(){
        this.age+=3;
    }
    public void setPrice(){
        this.price+=10000;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && brand != null && brand.equals(car.brand);
    }
    @Override
    public String toString(){
        return "Car - name = " + name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age, brand, price, color);
    }
}
