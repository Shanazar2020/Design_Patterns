package main.java.EventSubscription;

import main.java.EventSubscription.editor.Editor;
import main.java.EventSubscription.listeners.EmailNotificationListener;
import main.java.EventSubscription.listeners.LogFileListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogFileListener("main/java/EventSubscription/test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("example@mail.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
