//Write a program to replace all d with f and all l with t in the given ​ String
//        Input: daily dry
//        Output: faity fry
//        Original ​ string​ : daily dry
//        New ​ String​ : faity fry
package com.stackroute;

public class Replace {
    private char d, f, l, t;

    //This method replaces all occurances of d with f and l with t
    public String replaceCharacter(String s) {
        String s1 = s.replaceAll("d", "f");
        String s2 = s1.replaceAll("l", "t");
        return s2;
    }
}
