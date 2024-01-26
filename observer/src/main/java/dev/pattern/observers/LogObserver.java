package dev.pattern.observers;

public class LogObserver implements Observer {

    @Override
    public void update(String content) {
        System.out.println("Log: " + content);
    }
}
