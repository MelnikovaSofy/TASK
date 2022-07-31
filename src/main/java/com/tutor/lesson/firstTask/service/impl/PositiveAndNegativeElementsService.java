package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IPositiveAndNegativeElementsService;

public class PositiveAndNegativeElementsService implements IPositiveAndNegativeElementsService {
    public int countOfPositiveAndNegativeElements(CustomArray customArray) throws ServiceException {
        if (customArray != null) {
            int positive = 0, negative = 0;
            for (int i = 0; i < customArray.getValue().length; i++) {
                if(customArray.getValue()[i] > 0){
                    positive += 1;
                }
                else if (customArray.getValue()[i] < 0){
                    negative += 1;
                }
            }
            return(positive + negative);
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }
}
