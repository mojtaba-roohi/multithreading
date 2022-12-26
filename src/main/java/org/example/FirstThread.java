package org.example;

import javax.lang.model.type.UnionType;
import java.util.Random;

public class FirstThread implements Runnable {
    public final String threadName;

    public FirstThread(String name){
        this.threadName=name;
    }
    protected int countDown = 3;

    @Override
    public void run() {
        Random r=new Random();
        while (countDown-- > 0) {
            try {
                Thread.sleep(r.nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.threadName + countDown);
            Thread.yield();
        }
    }
}




