package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IMediumValueService;

public class MediumValueService implements IMediumValueService {
    public int findMedium(CustomArray customArray) throws ServiceException {
        if (customArray != null) {
            int sum = 0;
            for (int i = 0; i < customArray.getValue().length; i++) {
                sum += customArray.getValue()[i];
            }
            int medium = Math.round(sum/customArray.getValue().length);
            return medium;
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }
}
