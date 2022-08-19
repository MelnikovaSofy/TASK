package com.tutor.lesson.fourthTask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Point {
    private Long id;
    private BigDecimal xCoordinate;
    private BigDecimal yCoordinate;
    private String name;
}
