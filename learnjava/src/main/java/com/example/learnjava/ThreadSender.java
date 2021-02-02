package com.example.learnjava;

import java.io.*;
import java.util.*;


public class ThreadSender {
    public void send(String msg)
    {
        System.out.println("THREADSENDER: Sending\t"  + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("THREADSENDER: Thread  interrupted.");
        }
        System.out.println("\n THREADSENDER : " + msg + "Sent");
    }
}
