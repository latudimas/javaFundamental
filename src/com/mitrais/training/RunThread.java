package com.mitrais.training;

public class RunThread {
    public static void main (String[] args) {
        Threads t1 = new Threads("Thread 1");
        t1.start();

        Threads t2 = new Threads("Thread 2");
        t2.start();
    }
}
