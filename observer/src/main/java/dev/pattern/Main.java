package dev.pattern;

import dev.pattern.observers.EmailObserver;
import dev.pattern.observers.LogObserver;

public class Main {
    public static void main(String... args) {
        Observable observable = new Observable();

        var emailObserver = new EmailObserver();
        var logObserver = new LogObserver();

        observable.addObserver(emailObserver);
        observable.addObserver(logObserver);

        observable.notify("first notification");

        observable.removeObserver(emailObserver);

        observable.notify("second notification");
    }
}
