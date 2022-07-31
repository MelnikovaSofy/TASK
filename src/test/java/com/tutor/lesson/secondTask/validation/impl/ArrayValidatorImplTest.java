package com.tutor.lesson.secondTask.validation.impl;

import com.tutor.lesson.secondTask.validation.IArrayValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayValidatorImplTest {

    private final IArrayValidator iArrayValidator = new ArrayValidatorImpl();

    @Test
    void isNumber() {
        boolean actual = iArrayValidator.isNumber("11");
        assertTrue(actual);
    }

    @Test
    void isWord() {
        boolean actual = iArrayValidator.isWord(null);
        assertTrue(actual);
    }
}