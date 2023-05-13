package main.java.EventSubscription.publisher;

import main.java.EventSubscription.listeners.Listener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Publisher {
    Map<String, ArrayList<Listener>> listeners = new HashMap<>();

    public void subscribe(String eventType, Listener listener);

    public void unsubscribe(String eventType, Listener listener);

    public void notify(String eventType,  File file);
}
