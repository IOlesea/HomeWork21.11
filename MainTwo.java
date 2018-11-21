package com.company;

import java.util.Scanner;

public class MainTwo {
    public static void main(String... args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Let's play the game: Guess the number!!!");
        System.out.println("Enter the number between 1 - 30: ");
        int num = scanner.nextInt();
        Random1.VerifyNum(num);

        //System.out.println(PrimeNum.Prime(30));
        //PrimeNum.Divisor(30);
    }
}
