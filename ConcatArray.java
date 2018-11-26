package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatArray {
    static ArrayList<String> Concat(String[] first, String[] second){

        ArrayList <String> third = new ArrayList<>();
        third.addAll(Arrays.asList(first));
        third.addAll(Arrays.asList(second));
        return third;
    }
}
