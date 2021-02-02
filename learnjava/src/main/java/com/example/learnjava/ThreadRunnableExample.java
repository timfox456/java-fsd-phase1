package com.example.learnjava;

public class ThreadRunnableExample implements Runnable {
    public static int myCount = 0;
    public ThreadRunnableExample(){

    }
    public void run() {
        while(ThreadRunnableExample.myCount <= 10){
            try{
                System.out.println("RUNNABLE: Expl Thread: "+(++ThreadRunnableExample.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("RUNNABLE: Exception in thread: "+iex.getMessage());
            }
        }
    }
}
