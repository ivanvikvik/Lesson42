package by.itstep.vikvik.controller;

import java.util.concurrent.TimeUnit;

public class Printer {
    public void print(String text) {
        System.out.print("[");
        TimeUnit.MILLISECONDS.sleep(rnd1);

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            TimeUnit.MILLISECONDS.sleep(rnd2);
        }

        TimeUnit.MILLISECONDS.sleep(rnd3);
        System.out.println("]");
    }
}
