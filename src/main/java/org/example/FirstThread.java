package org.example;

public class FirstThread implements Runnable {
    protected int countDown = 10;

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(countDown);
            Thread.yield();
        }
    }
}
