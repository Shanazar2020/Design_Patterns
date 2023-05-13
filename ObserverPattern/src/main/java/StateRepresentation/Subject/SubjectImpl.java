package main.java.StateRepresentation.Subject;

import main.java.StateRepresentation.Observer.Observer;

import java.util.ArrayList;

public class SubjectImpl extends Subject {
    public SubjectImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
