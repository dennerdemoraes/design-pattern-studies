package dev.pattern.observers;

public class EmailObserver implements Observer {

    @Override
    public void update(String content) {
        System.out.println("Email: " + content);
    }
}
