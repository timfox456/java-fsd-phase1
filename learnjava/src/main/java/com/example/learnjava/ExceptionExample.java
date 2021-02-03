package com.example.learnjava;

import java.util.ArrayList;

public class ExceptionExample {

    String textToTranslate = "Helo there!";
    String properText = "Hello there!";
    String properTranslation = "Hola!";

    String correctString = "3";
    String incorrectString = "abc";



    public void HandleException() {



        ArrayList<String> myArray = new ArrayList<>();

        try {
            int correct = Integer.parseInt(correctString);
            int incorrect = Integer.parseInt(incorrectString);
        }
        catch(NumberFormatException ex) {
            System.err.println("Invalid integer format : ");
            System.err.println(ex.getMessage());
            //System.exit(1);
        }
        finally {
            System.out.println("We're done!");
        }

    }

    public String TranslateText() throws UnknownWordException {
      if (!textToTranslate.equals(properText)) {
          throw new UnknownWordException(textToTranslate);
      }
      return properTranslation;
    }

}
