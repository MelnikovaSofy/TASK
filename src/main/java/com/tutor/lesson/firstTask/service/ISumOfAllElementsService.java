package com.tutor.lesson.firstTask.service;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

public interface ISumOfAllElementsService {
    int sumOfArray(CustomArray customArray) throws ServiceException;
}
