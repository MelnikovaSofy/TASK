package com.tutor.lesson.firstTask.service;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

public interface IPositiveAndNegativeElementsService {
    int countOfPositiveAndNegativeElements(CustomArray customArray) throws ServiceException;
}
