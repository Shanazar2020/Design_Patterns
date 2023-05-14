package main.java.ThreadSafeSingletons;

public class BillPughSingleton {
    public String value;
    private BillPughSingleton(){
        try{
            Thread.sleep(1000);
            System.out.println("BillPughSingleton constructor called");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(String value) {
        System.out.println("BillPughSingleton instance created " + value);
        return SingletonHelper.INSTANCE;
    }
}
