package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LotoGame {
    static void Loto() {
        Random rand = new Random();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        System.out.println("Let's play the LotoGame!!!");
        int count=0;

        for(int i=0; i<5;i++){
            list1.add(rand.nextInt((35) + 1));
        }
        Collections.sort(list1);
        System.out.println("Yoy have 5 random numbers:" + list1);

        while (!Arrays.equals(list1.toArray(),list2.toArray())) {
            list2.clear();
            for(int i=0; i<5;i++){
                list2.add(rand.nextInt((35) + 1));
            }
            Collections.sort(list2);
            count++;
        }
        System.out.println("Congratulation!!!"   + "\nNumber guessed after " +count +" itteration");
        System.out.println("List generated: " + list2);

    }
}
