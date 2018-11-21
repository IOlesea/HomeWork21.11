package com.company;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

    static void VerifyNum(int num) {
        Random rand = new Random();
        int n = rand.nextInt(30) + 1;

        if ((num > 30)||(num < 1)) {
            System.out.println("The number you've enter is not from the interval");
        } else {
            if (n == num)
                System.out.println("You've guess the number" );
            else if (n > num)
                System.out.println("The number you choose is too small.");
            else
                System.out.println("The number you choose is too big.");
        }
    }
}
