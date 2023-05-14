package main.java.ThreadSafeSingletons;

public class MultiThreadedDemo {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            BillPughSingleton singleton = BillPughSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            BillPughSingleton singleton = BillPughSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
