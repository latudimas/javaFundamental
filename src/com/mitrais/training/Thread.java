package com.mitrais.training;

class Threads implements Runnable {
    private Thread t;
    private String threadName;
    Threads (String name){
        threadName = name;
        System.out.println("thread " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running" + threadName);
        ThreadHitung t1 = new ThreadHitung("Calcullate", threadName);
        t1.start();
        ThreadBaca t2 = new ThreadBaca("Read", threadName);
        t2.start();
        System.out.println("Thread " + threadName + " existing");
    }

    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}