package com.example.learnjava;

public class StringExample {

    private String myName = "Tim";

    public void TestStrings() {

        System.out.println(myName);

        System.out.println(myName + "othy");

        StringBuffer buffer = new StringBuffer(myName);
        StringBuilder builder = new StringBuilder(myName);

        buffer.append("othy");
        builder.append("othy");

        System.out.println(buffer.toString());


        for (int i = 0; i < 10; i ++) {
            builder.append(String.valueOf(i));
            System.out.println(builder.toString());

        }

    }

}
