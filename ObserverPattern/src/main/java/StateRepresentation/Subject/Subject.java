package main.java.StateRepresentation.Subject;

import main.java.StateRepresentation.Observer.Observer;

import java.util.List;

public abstract class Subject {
    protected List<Observer> observers;
    protected int state;

    public int getState() {
        return state;
    }

    public abstract void setState(int state);
    public abstract void attach(Observer observer);

    public abstract void notifyAllObservers();
}
