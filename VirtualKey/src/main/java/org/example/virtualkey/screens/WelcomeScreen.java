package org.example.virtualkey.screens;

import java.util.ArrayList;

public class WelcomeScreen implements Screen {

    private String welcomeText = "Welcome to VirtualKey!";
    private String developerText = "Developer: Tim Fox";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomeScreen() {
        options.add("1. Add a File");
        options.add("2. Delete A File");
        options.add("3. Search A FIle");
    }
    @Override
    public void Show()
    {
        System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
        
        for (String s : options)  {
            System.out.println(s);
        }

    }

    @Override
    public void NavigateOption(int option)
    {

    }

}
