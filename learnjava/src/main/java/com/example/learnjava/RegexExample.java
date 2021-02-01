package com.example.learnjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExample {

    final String regex = "\\d{3}\\-\\d{3}\\-\\d{4}";
    final String string = "\n"
            + "Here is my phone number:\n\n"
            + "202-333-4321\n"
            + "575-231-3432, 322-343-4321\n"
            + "343-321-3213\n\n"
            + "12312234\n"
            + "23231\n"
            + "2\n"
            + "32\n"
            + "32\n"
            + "3243\n"
            + "212325434324";

    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(string);

    public void FindPatterns() {
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

}
