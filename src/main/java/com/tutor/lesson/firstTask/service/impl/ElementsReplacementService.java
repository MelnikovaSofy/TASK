package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IElementsReplacementService;

public class ElementsReplacementService implements IElementsReplacementService {
    public CustomArray replacement(CustomArray customArray, int condition, int replacementValue) throws ServiceException {
        if (customArray != null) {
            for (int i = 0; i < customArray.getValue().length; i++) {
                if (customArray.getValue()[i] == condition){
                    customArray.getValue()[i] = replacementValue;
                }
            }
            return customArray;
        }
        else {
            throw new ServiceException("Object is null!");
        }
    }
}
