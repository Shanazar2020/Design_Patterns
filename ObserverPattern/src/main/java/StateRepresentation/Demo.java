package main.java.StateRepresentation;

import main.java.StateRepresentation.Observer.HexObserver;
import main.java.StateRepresentation.Observer.OctalObserver;
import main.java.StateRepresentation.Observer.BinaryObserver;
import main.java.StateRepresentation.Subject.Subject;
import main.java.StateRepresentation.Subject.SubjectImpl;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
