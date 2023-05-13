package main.java.EventSubscription.publisher;

import main.java.EventSubscription.listeners.Listener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Publisher {
    Map<String, ArrayList<Listener>> listeners = new HashMap<>();

    void subscribe(String eventType, Listener listener);

    void unsubscribe(String eventType, Listener listener);

    void notify(String eventType,  File file);
}
