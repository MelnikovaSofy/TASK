package com.tutor.lesson.input;

import static java.lang.Integer.parseInt;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.inheritance.Car;
import com.tutor.lesson.secondTask.input.PrintToFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {


    private final static Logger LOG = LogManager.getLogger(PrintToFile.class);

    public static void main(String[] args) {
        /*String path = "src/main/resources/first.txt";
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        PrintToFile.inputFile(arr, path);*/
        /*List<String> list = new ArrayList<>();
        list = PrintToFile.readFile("src/main/resources/first.txt");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String []arr = str.split(", ");
            for (int j = 0; j < arr.length; j++) {
                integerList.add(Integer.valueOf(arr[j]));
            }
        }
        LOG.info(integerList);*/
        /*String str = Input.readLine();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            flag = str.charAt(i) != '1' && str.charAt(i) != '2';
            if (!flag)
                System.out.println("incorrect input");
                System.exit(1);
        }
        flag = true;
        System.out.println("Your input: " + str);
        CarMassive.get(30);*/
    }


    public void test(){
        int i1 = 1;
        int i2 = 1;

        /*Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(i2 == i1);

        System.out.println(integer1.intValue() == integer2.intValue());

        System.out.println(integer1 == i1);*/

        Car car1 = new Car();
        Car car2 = new Car();
        car1.setBrand("BMW");
        car2.setBrand("BMW");
        car1.setAge();
        car2.setAge();
        car1.setColor("Black");
        car2.setColor("Black");

        System.out.println(car1 == car2);//false

        System.out.println(car1.equals(car2));//true*/

    }















        /*System.out.print("Enter your name: ");
        String retMessage = new String();
        retMessage = Input.retString();
        if (retMessage.length() == 0) {
            System.out.print("You didn`t enter anything!");
        }
        else {
            var arr = retMessage.split("");
            for (int i = 0; i < arr.length; i++) {
                //if (Number.isInteger(parseInt(arr[i])))
                if (arr[i] == "0" || arr[i] == "1" || arr[i] == "2" || arr[i] == "3" || arr[i] == "4" || arr[i] == "5" || arr[i] == "6" || arr[i] == "7" || arr[i] == "8" || arr[i] == "9") {
                    System.out.println("Name entered incorrectly!");
                } else {
                    System.out.println("Hello, " + retMessage + "!");
                }
            }
        }*/
        /*System.out.println("Input your age: ");
        Integer message = Input.resChislo();
        System.out.println("Age = " + message);*/
}

