//Write a program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
//        methods.
//        Input : She sells seashells by the seashore
//        Given word: se
//        Output :
//        Found at: 4 - 6Found at: 10 - 12
//        Found at: 27 – 29
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfOccurances {
    //This method counts the number of occurances of a particular pattern
    public int countNumberOfOccurances(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("se");
        Matcher m = pattern.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }
}
