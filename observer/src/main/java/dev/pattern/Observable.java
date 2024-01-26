package dev.pattern;

import dev.pattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notify(String content) {
        for (Observer observer : this.observers) {
            observer.update(content);
        }
    }
}
