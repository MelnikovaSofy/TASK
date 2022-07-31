package com.tutor.lesson.firstTask.service;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;

public interface IMediumValueService {
    int findMedium(CustomArray customArray) throws ServiceException;
}
