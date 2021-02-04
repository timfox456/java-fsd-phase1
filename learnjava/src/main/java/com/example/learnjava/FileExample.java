package com.example.learnjava;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    private File myFile;

    public File getMyFile() {
        return myFile;
    }

    public File CreateFile(String fileName) {

        try {
            myFile = new File(fileName);
            if (myFile.exists()) {
                System.out.println(fileName + " already exists");
                return (myFile);
            }

            myFile.createNewFile();
            System.out.println(fileName + " created");

        }
        catch( Exception ex) {
            System.err.println(ex.getMessage());
        }
        return myFile;
    }

    public boolean DeleteFileIfExists(String fileName) {
        boolean status = false;
        try {
            myFile = new File(fileName);
            if (myFile.exists()) {
                status = myFile.delete();
               if (status == true) {
                   System.out.println("Deleted");
               }
               else {
                   System.out.println("No delete performed.");
               }
               return status;
            }
        }
        catch( Exception ex) {
            System.err.println(ex.getMessage());
        }
        return status;
    }

    public boolean WriteFile(String textToWrite) {

        FileWriter writer = null;
        try {
            writer = new FileWriter(myFile);
            writer.write(textToWrite);

            return true;
        }
        catch(IOException iex) {
            System.err.println("Failed writing to file.");
        }
        catch(NullPointerException npe) {
            System.err.println("File does not exist yet.");
        }
        finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
            e.printStackTrace();
            }
        }
        return false;
    }

}
