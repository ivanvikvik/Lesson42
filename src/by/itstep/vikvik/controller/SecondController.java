package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.SecondThread;

import java.util.concurrent.TimeUnit;

public class SecondController {
    public static void main(String[] args) throws InterruptedException {
        SecondThread threadLogic = new SecondThread();
        Thread thread = new Thread(threadLogic);
        thread.start();

//        SecondThread threadLogic = new SecondThread();
//        new Thread(threadLogic).start();

//        new Thread(new SecondThread()).start();

//        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(5);

        Thread main = Thread.currentThread();

        while(true) {
            System.out.printf("\nid = %d, name = %s",
                    main.getId(), main.getName());
        }
    }
}
