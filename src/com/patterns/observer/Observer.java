package com.patterns.observer;

import com.patterns.memento.Save;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
