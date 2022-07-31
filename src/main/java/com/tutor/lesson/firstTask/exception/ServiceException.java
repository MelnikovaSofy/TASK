package com.tutor.lesson.firstTask.exception;

import com.tutor.lesson.secondTask.input.PrintToFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceException extends Exception{

    private final static Logger LOG = LogManager.getLogger(ServiceException.class);

    public ServiceException(String mes){
        LOG.info(mes);
    }
}
