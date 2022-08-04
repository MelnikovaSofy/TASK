package com.tutor.lesson.thirdTask;

import com.tutor.lesson.thirdTask.factory.MarkEnum;
import com.tutor.lesson.thirdTask.factory.MarksFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        MarksFactory marksFactory = new MarksFactory();
        Mark excellent = marksFactory.createMark(MarkEnum.EXCELLENT);
        LOGGER.info(excellent);
    }
}
