package org.example;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        fixedThreadPool();

//newThread();
    }

    public static void fixedThreadPool() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new FirstThread("first"));
        executor.execute(new FirstThread("second"));
        executor.execute(new FirstThread("third"));

    }

    public static void singleThreadExecutor() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new FirstThread("first"));
        executor.execute(new FirstThread("second"));
    }


    public static void cachedThreadPool() {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new FirstThread("first"));
        executor.execute(new FirstThread("second"));
        executor.execute(new FirstThread("third"));

    }

    public static void newThread() {
        System.out.println("Program start!");
        Thread thread1 = new Thread(new FirstThread("first"));
        thread1.start();
        Thread thread2 = new twiceThread();
        thread2.start();


        thread1.start();

        Thread thread3 = new Thread(new FirstThread("twice"));
        thread3.start();

        System.out.println("main program finished");
    }
}