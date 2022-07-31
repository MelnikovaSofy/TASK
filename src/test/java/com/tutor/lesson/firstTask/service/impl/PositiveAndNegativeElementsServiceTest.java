package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IPositiveAndNegativeElementsService;
import com.tutor.lesson.firstTask.service.ISumOfAllElementsService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PositiveAndNegativeElementsServiceTest {
    private final IPositiveAndNegativeElementsService iPositiveAndNegativeElementsService = new PositiveAndNegativeElementsService();

    @Test
    void countOfPositiveAndNegativeElements() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, -2, 0});
        try {
            int test = iPositiveAndNegativeElementsService.countOfPositiveAndNegativeElements(arr);
            assertEquals(2, test);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}