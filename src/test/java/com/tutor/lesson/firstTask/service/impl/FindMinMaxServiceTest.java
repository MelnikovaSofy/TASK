package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IFindMinMaxService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FindMinMaxServiceTest {
    private final IFindMinMaxService iFindMinMaxService_Min = new FindMinMaxService();
    private final IFindMinMaxService iFindMinMaxService_Max = new FindMinMaxService();

    @Test
    void findMin() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        try {
            int actual = iFindMinMaxService_Min.findMin(arr);
            assertEquals(1, actual);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @Test
    void findMax() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        try {
            int actual = iFindMinMaxService_Max.findMax(arr);
            assertEquals(3, actual);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}