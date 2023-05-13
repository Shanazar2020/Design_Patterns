package main.java.EventSubscription.editor;

import main.java.EventSubscription.publisher.EventManager;
import main.java.EventSubscription.publisher.Publisher;

import java.io.File;

public class Editor {
    public Publisher events;
    private File file;

    public Editor(){
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile(){
        if(this.file != null){
            events.notify("save", file);
        }else{
            System.out.println("Please open a file first.");
        }
    }
}
