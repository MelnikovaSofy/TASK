package com.tutor.lesson.thirdTask.service;

import com.tutor.lesson.thirdTask.Mark;
import com.tutor.lesson.thirdTask.service.exception.ServiceException;

public interface IMarkService {
    Mark typeOfMark(int mark) throws ServiceException;
}
