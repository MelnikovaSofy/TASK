package com.tutor.lesson.input;

import com.tutor.lesson.firstTask.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Input {

    private final static Logger LOG = LogManager.getLogger(Input.class);

    public static String retString(){
        Scanner str = new Scanner(System.in);
        String message = str.nextLine();
        return message;
    }

    public static Integer resChislo(){
        Scanner str = new Scanner(System.in);
        if (str.hasNextInt()){
            Integer chislo = str.nextInt();
            return chislo;
        }
        else{
            LOG.error("Ваше сообщение неверно!");
            System.exit(1);
        }

        return 0;
    }

    public static String readLine() {
        Scanner str = new Scanner(System.in);
        return "0";
    }
}
