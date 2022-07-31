package com.tutor.lesson.firstTask.entity;

import com.tutor.lesson.inheritance.Car;

import java.util.Arrays;

public class CustomArray {
    private int[] value;

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            str.append(value[i]);
            if (i != value.length-1){
                str.append(", ");
            }
        }
        return str.toString();
    }
}
