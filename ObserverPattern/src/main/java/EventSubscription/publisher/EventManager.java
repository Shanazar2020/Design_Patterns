package main.java.EventSubscription.publisher;


import main.java.EventSubscription.listeners.Listener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EventManager implements Publisher{

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    @Override
    public void subscribe(String eventType, Listener listener) {
        List<Listener> newListeners = listeners.computeIfAbsent(eventType, k -> new ArrayList<>());
        newListeners.add(listener);
    }

    @Override
    public void unsubscribe(String eventType, Listener listener) {
        List<Listener> newListeners = listeners.get(eventType);
        newListeners.remove(listener);
    }

    @Override
    public void notify(String eventType, File file) {
        List<Listener> newListeners = listeners.get(eventType);
        for (Listener listener : newListeners) {
            listener.update(eventType, file);
        }
    }
}
