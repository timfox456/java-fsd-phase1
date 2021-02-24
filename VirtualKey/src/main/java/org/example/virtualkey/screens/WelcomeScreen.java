package org.example.virtualkey.screens;

import org.example.virtualkey.services.DirectoryService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.example.virtualkey.entities.File;
import org.example.virtualkey.services.ScreenService;

public class WelcomeScreen implements Screen {

    private String welcomeText = "Welcome to VirtualKey!";
    private String developerText = "Developer: Tim Fox";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomeScreen() {
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Quit");

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
    public void GetUserInput()
    {
        int selectedOption;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option)
    {
        switch(option) {

            case 1: // Show Files
                this.ShowFiles();
                break;
            case 2: // Show Submenu

                ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();

                break;
            default:
                System.out.println("Invalid Option");
                break;

        }

    }

    public void ShowFiles() {

        //TODO: Get the files from the Directory

        DirectoryService.PrintFiles();



    }
    public void AddFile() {
        System.out.println("Please Enter the Filename:");

        String fileName = this.getInputString();

        System.out.println("You are adding a file named: " + fileName);

    }

    private String getInputString()
    {

        Scanner in = new Scanner(System.in);
        return(in.nextLine());

    }
    private int getOption()
    {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }

}
