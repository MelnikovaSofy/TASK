package com.tutor.lesson.thirdTask.input;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Input {
    private final static Logger LOG = LogManager.getLogger(com.tutor.lesson.input.Input.class);

    public static Integer retMark(){
        Scanner str = new Scanner(System.in);
        if (str.hasNextInt()){
            Integer mark = str.nextInt();
            return mark;
        }
        else{
            LOG.error("Вы ввели не цифру!");
            System.exit(1);
        }

        return 0;
    }
}
