package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {
    /*
     * Observer Design Pattern
     *
     * The Observer pattern is a behavioral design pattern that defines a one-to-many
     * dependency between objects so that when one object changes state, all its
     * dependents are notified and updated automatically.
     *
     * In this example, we have an Observable class that maintains a list of
     * observers. When an event occurs, it notifies all registered observers.
     */

    public static void main(String[] args) {
        Observable observable = new Observable();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        Notification event = new Notification("Event 1", "This is the first event");
        observable.notifyObservers(event);

        observable.removeObserver(observer1);

        Notification event2 = new Notification("Event 2", "This is the second event");
        observable.notifyObservers(event2);
    }
}

record Notification(String name, String description) {}

interface Observer {
    void update(Notification event);
}

class Observable {
    private final List<Observer> observers;

    Observable() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Notification event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}

class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Notification event) {
        System.out.println("Observer " + name + " received event: " + event.name() + " - " + event.description());
    }
}
