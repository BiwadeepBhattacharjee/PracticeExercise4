//Write a program to transpose the given ​ string​ .
//        Input ​ String​ : a quick brown fox jumps over the lazy dog
//        Output ​ String​ : a kciuq nworb xof spmuj revo eht yzal god
package com.stackroute;

import java.util.Arrays;

public class Transpose {
    //This method reverses each word in the string
    public String transposeWords(String input) {
        String[] words = input.split("\\s");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            String reverse = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                reverse = reverse + s.charAt(j);
            }
            result = result.concat(reverse).concat(" ");
        }
        return result.trim();
    }
}
