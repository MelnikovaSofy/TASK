package com.tutor.lesson.fourthTask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rectangle {
    private String name;
    private BigDecimal square;
    private BigDecimal perimeter;
}
