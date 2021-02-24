package org.example.virtualkey;

import org.example.virtualkey.entities.*;
import org.example.virtualkey.screens.WelcomeScreen;
import org.example.virtualkey.services.DirectoryService;
import org.example.virtualkey.services.ScreenService;

import java.util.Optional;

public class VirtualKeyApplication {


    public static String Greeting() {
        return("Hello World!");
    }

    public static void main(String[] args) {


        DirectoryService.AddTestData();
        DirectoryService.PrintFiles();
        //WelcomeScreen screen = new WelcomeScreen();

        ScreenService.getCurrentScreen().Show();
        ScreenService.getCurrentScreen().GetUserInput();

    }
}
