package com.example.emailvalidate;

public class EmailSearcher {
    String[] emails = {"tim@yahoo.com", "tim@gmail.com", "tim@google.com", "tim@microsoft.com", "tim@apple.com", "tim@facebook.com"};

    public boolean SearchEmail(String emailToSearch) {

        for (String email : emails) {
            if(email.equals(emailToSearch)) {
                return true;
            }
        }
        return false;
    }
}
