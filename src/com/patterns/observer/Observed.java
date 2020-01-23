package com.patterns.observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);// удаление подписчика (observer)

    void notifyObservers();//уведомление..
}
