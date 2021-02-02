package com.example.learnjava;

public class ThreadSleepWaitExample {

    private static Object LOCK = new Object();
    public static void RunSleepWait() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("SLEEPWAIT: Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK)
        {
            LOCK.wait(1000);
            System.out.println("SLEEPWAIT: Object '" + LOCK + "' is woken after" + " waiting for 1 second");
        }

    }

}
