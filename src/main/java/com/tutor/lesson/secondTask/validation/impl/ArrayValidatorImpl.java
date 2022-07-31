package com.tutor.lesson.secondTask.validation.impl;

import com.tutor.lesson.secondTask.validation.IArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidatorImpl implements IArrayValidator {

    private final static Logger LOG = LogManager.getLogger(ArrayValidatorImpl.class);
    private final static String REGEX_FOR_NUMBER = "[0-9]+";
    private final static String REGEX_FOR_WORD = "[a-z\\sA-Z]+";
    private final static String REGEX_FOR_ARRAY = "[0-9,\\s]+";

    @Override
    public boolean isNumber(String str) {
        boolean value = str.matches(REGEX_FOR_NUMBER);
        return value;
    }

    @Override
    public boolean isWord(String str) {
        if (str == null){
            LOG.error("Объект равен null!");
            return false;
        }
        if (str.isEmpty()){
            LOG.warn("Строка пустая!");
            return false;
        }
        if (str.matches(REGEX_FOR_WORD)) {
            return true;
        }
        else{
            return false;
        }
        // TODO: 26.07.2022 доделать проверку на пустоту
        // TODO: 26.07.2022 вынести regex в константы
    }

    @Override
    public boolean isArrayOfNumberFilling(String str){
        if (str.isEmpty()){
            LOG.warn("Строка пустая!");
        }
        if (str.matches(REGEX_FOR_ARRAY)) {
            return true;
        }
        else {
            return false;
        }
        // TODO: 26.07.2022 убрать весь код, кроме matches
        // TODO: 26.07.2022 почитать про компаратор и компэрэбл
    }
}
