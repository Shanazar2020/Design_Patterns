package main.java.EventSubscription.listeners;

import java.io.File;

public interface Listener {
    public void update(String eventType, File file);
}
