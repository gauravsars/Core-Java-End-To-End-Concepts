package com.ThreadDemo;

import java.util.Vector;

class Producer extends Thread {
	 
    static final int MAXQUEUE = 5;
    private Vector messages = new Vector();
 
    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
                //sleep(5000);
            }
        } catch (InterruptedException e) {
        }
    }
 
    private synchronized void putMessage() throws InterruptedException {
        while (messages.size() == MAXQUEUE) {
        	System.out.println(" Wearhouse is full "+messages.size());
            wait();
        }
        messages.addElement(new java.util.Date().toString());
        System.out.println("put message");
        notify();
        //Later, when the necessary event happens, the thread that is running it calls notify() from a block synchronized on the same object.
    }
 
    // Called by Consumer
    public synchronized String getMessage() throws InterruptedException {
        notify();
        while (messages.size() == 0) {
        	System.out.println("Wearhouse is empty ");
            wait();//By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
        }
        String message = (String) messages.firstElement();
        messages.removeElement(message);
        return message;
    }
}