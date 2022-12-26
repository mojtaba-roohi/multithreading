package org.example;

public class twiceThread extends Thread {
    protected int countDown = 10;

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println("twiceThread" + countDown);
            Thread.yield();
        }
    }
}
