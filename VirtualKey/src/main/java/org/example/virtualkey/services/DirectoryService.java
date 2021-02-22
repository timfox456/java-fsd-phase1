package org.example.virtualkey.services;

import org.example.virtualkey.entities.Directory;
import org.example.virtualkey.entities.File;

public class DirectoryService {

    private static Directory fileDirectory = new Directory();


    public static void AddTestData() {
        fileDirectory.AddFile(new File("test1.txt"));
        fileDirectory.AddFile(new File("test2.txt"));
        fileDirectory.AddFile(new File("test3.txt"));
        fileDirectory.AddFile(new File("test4.txt"));


    }

    public static void PrintFiles() {

        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }


}
