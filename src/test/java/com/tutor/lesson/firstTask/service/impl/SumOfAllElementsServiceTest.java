package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IFindMinMaxService;
import com.tutor.lesson.firstTask.service.ISumOfAllElementsService;
import com.tutor.lesson.firstTask.service.impl.SumOfAllElementsService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SumOfAllElementsServiceTest {
    private final ISumOfAllElementsService iSumOfAllElementsService = new SumOfAllElementsService();

    @Test
    void sumOfArray() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        try {
            int test = iSumOfAllElementsService.sumOfArray(arr);
            assertEquals(6, test);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}