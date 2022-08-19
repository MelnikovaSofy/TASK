package com.tutor.lesson.thirdTask.service.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceException extends Exception{

    private final static Logger LOG = LogManager.getLogger(com.tutor.lesson.firstTask.exception.ServiceException.class);

    public ServiceException(String mes){
        LOG.info(mes);
    }
}
