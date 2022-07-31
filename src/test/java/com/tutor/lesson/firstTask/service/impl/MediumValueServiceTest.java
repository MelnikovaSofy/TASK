package com.tutor.lesson.firstTask.service.impl;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import com.tutor.lesson.firstTask.service.IMediumValueService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MediumValueServiceTest {
    private final IMediumValueService iMediumValueService = new MediumValueService();

    @Test
    void findMedium() {
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        try {
            int actual = iMediumValueService.findMedium(arr);
            assertEquals(2, actual);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}