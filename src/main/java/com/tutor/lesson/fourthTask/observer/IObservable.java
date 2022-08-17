package com.tutor.lesson.fourthTask.observer;

import com.tutor.lesson.fourthTask.entity.Rectangle;

public interface IObservable {
    boolean addObserver(IObserver observer);
    boolean removerObserver(IObserver observer);
    boolean notifyObservers(Rectangle rectangle);
}