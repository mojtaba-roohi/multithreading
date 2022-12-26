package org.example;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start!");
        Thread thread=new Thread(new FirstThread());
        thread.start();
        System.out.println("main program finished");
    }
}