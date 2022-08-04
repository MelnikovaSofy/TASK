package com.tutor.lesson.thirdTask.factory;

import com.tutor.lesson.thirdTask.Mark;

public class MarksFactory {
    public Mark createMark (MarkEnum type){
        return type.getVALUE();
        /*return switch (type){
            case EXCELLENT -> type.getVALUE();
            case GOOD -> type.getVALUE();
            case OK -> type.getVALUE();
            default -> throw new RuntimeException();
        };*/
    }
}
