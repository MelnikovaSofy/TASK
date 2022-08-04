package com.tutor.lesson.thirdTask.factory;

import com.tutor.lesson.thirdTask.Excellent;
import com.tutor.lesson.thirdTask.Good;
import com.tutor.lesson.thirdTask.Mark;
import com.tutor.lesson.thirdTask.Ok;

public enum MarkEnum {
    EXCELLENT(new Excellent("Excellent")),
    GOOD(new Good("Good")),
    OK(new Ok("Ok"))
    ;
    final Mark VALUE;

    MarkEnum(Mark VALUE) {
        this.VALUE = VALUE;
    }

    public Mark getVALUE() {
        return VALUE;
    }
}
