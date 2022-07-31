package com.tutor.lesson.firstTask.service;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

public interface IFindMinMaxService {
    int findMin(CustomArray customArray) throws ServiceException;
    int findMax(CustomArray customArray) throws ServiceException;
}
