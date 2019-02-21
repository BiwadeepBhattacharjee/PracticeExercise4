//Write a java program to count the total number of occurrences of a given character in a ​ string
//        without using any loop
package com.stackroute;

public class CountOfACharacter {
    //This method counts the number of occurances of a character in a string and returns an integer count
    public int occurancesOfACharacter(char c, String s) {

        int count = s.length() - s.replaceAll(String.valueOf(c), "").length();

        return count;
    }
}
