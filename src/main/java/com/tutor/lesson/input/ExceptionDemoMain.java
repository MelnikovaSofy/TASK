package com.tutor.lesson.input;

import com.tutor.lesson.firstTask.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class ExceptionDemoMain {

    private final static Logger LOG = LogManager.getLogger(ExceptionDemoMain.class);

    public static void main(String[] args) {
        ExceptionDemoMain st = new ExceptionDemoMain();
        st.start();
    }

    public void start(){
        try{
            throw new NullPointerException();
            //throw new IOException();
        }
        catch (RuntimeException e){
            LOG.error("Я словил ошибку!");
        }
    }
}
