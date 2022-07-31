package com.tutor.lesson.firstTask.service;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

public interface IElementsReplacementService {
    CustomArray replacement(CustomArray customArray, int condition, int replacementValue) throws ServiceException;
}
