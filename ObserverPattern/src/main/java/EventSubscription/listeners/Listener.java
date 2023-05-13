package main.java.EventSubscription.listeners;

import java.io.File;

public interface Listener {
    void update(String eventType, File file);
}
