package main.java.EventSubscription.listeners;

import java.io.File;

public class LogFileListener implements Listener {
        private final String log;

        public LogFileListener(String log) {
            this.log = log;
        }
        @Override
        public void update(String eventType, File file) {
            System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
        }

}
