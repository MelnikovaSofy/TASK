package com.tutor.lesson.thirdTask.validation.impl;

import com.tutor.lesson.thirdTask.validation.IMarkValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MarkValidator implements IMarkValidator {
    private final static Logger LOG = LogManager.getLogger(MarkValidator.class);
    private final static String REGEX_FOR_NUMBER = "[3-5]";

    @Override
    public boolean isMark(String str) {
        if (str.isEmpty()){
            LOG.warn("Строка пустая!");
        }
        if (str.matches(REGEX_FOR_NUMBER)) {
            return true;
        }
        else {
            LOG.error("Несуществующая оценка!");
            return false;
        }
    }
}
