package org.example.virtualkey.screens;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FileOptionsScreen implements Screen {

    private ArrayList<String> options = new ArrayList<>();



    public FileOptionsScreen() {
        options.add("1. Add a File");
        options.add("2. Delete A File");
        options.add("3. Search A FIle");
        options.add("4. Quit");

    }

    @Override
    public void Show()
    {
        System.out.println("\n");

        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput()
    {
        int selectedOption;
        while ((selectedOption = this.getOption()) != 4) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option)
    {
        switch(option) {

            case 1: // Add File
                this.AddFile();
                break;
            default:
                System.out.println("Invalid Option");
                break;

        }

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
