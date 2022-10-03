package by.itstep.vikvik.model;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        while(true) {
            System.out.printf("\nid = %d, name = %s",
                    thread.getId(), thread.getName());
        }
    }
}
