package com.example.learnjava;

class ThreadedSend extends Thread
{
    private String msg;
    private Thread t;
    ThreadSender  sender;
    ThreadedSend(String m,  ThreadSender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        synchronized(sender)
        {
            sender.send(msg);
        }
    }
}
