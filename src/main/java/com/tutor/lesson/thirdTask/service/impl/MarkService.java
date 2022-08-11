package com.tutor.lesson.thirdTask.service.impl;

import com.tutor.lesson.thirdTask.Mark;
import com.tutor.lesson.thirdTask.factory.MarkEnum;
import com.tutor.lesson.thirdTask.factory.MarksFactory;
import com.tutor.lesson.thirdTask.service.IMarkService;


public class MarkService implements IMarkService {

    public Mark typeOfMark(int mark) {
        MarksFactory marksFactory = new MarksFactory();
        Mark excellent = marksFactory.createMark(MarkEnum.EXCELLENT);
        Mark good = marksFactory.createMark(MarkEnum.GOOD);
        Mark ok = marksFactory.createMark(MarkEnum.OK);
        return switch (mark){
            case 5 -> excellent;
            case 4 -> good;
            case 3 -> ok;
            default -> throw new RuntimeException();
        };
    }
}
