//Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
//        a. Extract the words from the text and sort them into alphabetical order.
//        b. Display the sorted list of words.
package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticalOrder {
    //This method sorts the contents of a paragraph in alphabetical order
    public ArrayList sortInAlphabeticalOrder(ArrayList<String> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }
}
