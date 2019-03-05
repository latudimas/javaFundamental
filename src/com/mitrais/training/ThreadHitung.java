package com.mitrais.training;

class ThreadHitung implements Runnable {
    private Thread t;
    private String threadName, threadParent;
    ThreadHitung(String name, String threadParent){
        threadName = name;
        this.threadParent = threadParent;
    }

    @Override
    public void run() {
        System.out.println(threadParent + " run Calculating....");
    }

    public void start () {
        System.out.println("Starting " + threadParent + " run " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}