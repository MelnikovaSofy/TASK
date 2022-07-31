package com.tutor.lesson.secondTask.validation;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

import java.util.List;

public interface IArrayValidator {
    boolean isNumber(String str);
    boolean isWord(String str);
    boolean isArrayOfNumberFilling(String str);
}
