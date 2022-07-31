package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IElementsReplacementService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ElementsReplacementServiceTest {
    private final IElementsReplacementService iElementsReplacementService = new ElementsReplacementService();

    @Test
    void replacement() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        int testCondition = 3;
        int testReplacementValue = 1000;
        CustomArray expected = new CustomArray();
        expected.setValue(new int[] {1, 2, 1000});
        try {
            CustomArray actual = iElementsReplacementService.replacement(arr, testCondition, testReplacementValue);
            assertEquals(expected, actual);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}