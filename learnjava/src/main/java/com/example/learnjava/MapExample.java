package com.example.learnjava;



import java.util.ArrayList;
import java.util.HashMap;

public class MapExample {
    public void ShowMap() {

        ArrayList<HashMap<String, String>> students = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> tim = new HashMap<String, String>();


        tim.put("name", "Tim");

        tim.put("address", "123 Main Street");

        students.add(tim);


        System.out.println(tim.get("name"));
    }

}
