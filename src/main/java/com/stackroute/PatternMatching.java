//Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
//        Harry in a ​ string​ .
//        Input: This is Harry.
//        Output: Is Harry here ? true
//        Input : This is Henry.
//        Output: Is Harry here ? False
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    //This method matches the pattern with the input string
    public boolean patternMatchingMethod(String s) {
        //Search for the given pattern
        Pattern pattern = Pattern.compile("Harry");

        // Search above pattern in String s
        Matcher m = pattern.matcher(s);
        return m.find();
    }
}
