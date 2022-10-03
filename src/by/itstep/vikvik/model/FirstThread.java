package by.itstep.vikvik.model;

public class FirstThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.printf("\nid = %d, name = %s",
                    getId(), getName());
        }
    }
}
