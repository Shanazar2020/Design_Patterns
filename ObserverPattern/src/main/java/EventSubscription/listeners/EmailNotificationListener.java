package main.java.EventSubscription.listeners;

import java.io.File;

public class EmailNotificationListener implements Listener {
    private final String email;
    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + this.email + ": Someone has performed " + eventType + " operation with the following data: " + file.getName());
    }

}
