package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.ISumOfAllElementsService;

public class SumOfAllElementsService implements ISumOfAllElementsService {
    public int sumOfArray(CustomArray customArray) throws ServiceException {
        if (customArray != null) {
            int sum = 0;
            for (int i = 0; i < customArray.getValue().length; i++) {
                sum += customArray.getValue()[i];
            }
            return sum;
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }
}
