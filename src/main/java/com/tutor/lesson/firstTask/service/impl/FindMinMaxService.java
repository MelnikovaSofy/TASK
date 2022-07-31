package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IFindMinMaxService;

public class FindMinMaxService implements IFindMinMaxService {
    public int findMin(CustomArray customArray) throws ServiceException {
        if (customArray != null) {
            int minValue = customArray.getValue()[0];
            for (int i = 1; i < customArray.getValue().length; i++) {
                if (customArray.getValue()[i] < minValue){
                    minValue = customArray.getValue()[i];
                }
            }
            return minValue;
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }

    public int findMax(CustomArray customArray) throws ServiceException{
        if (customArray != null) {
            int maxValue = customArray.getValue()[0];
            for (int i = 1; i < customArray.getValue().length; i++) {
                if (customArray.getValue()[i] > maxValue){
                    maxValue = customArray.getValue()[i];
                }
            }
            return maxValue;
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }
}
