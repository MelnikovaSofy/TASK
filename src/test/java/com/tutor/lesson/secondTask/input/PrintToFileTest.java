package com.tutor.lesson.secondTask.input;

import com.tutor.lesson.firstTask.entity.CustomArray;
import com.tutor.lesson.firstTask.exception.ServiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class PrintToFileTest {


    @Test
    void inputFile() {
        String path = "src/main/resources/test/FileForTests.txt.txt";
        CustomArray arr = new CustomArray();
        arr.setValue(new int[] {1, 2, 3});
        boolean actual = PrintToFile.inputFile(arr, path);
        assertTrue(actual);
    }

    @Test
    void readFile(){
        String actual = PrintToFile.readFile("src/main/resources/test/FileForTests.txt.txt");
        String path_new = "";
        String expected = "1, 2, 3";
        assertEquals(expected, actual);
    }
}