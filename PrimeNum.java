package com.company;

public class PrimeNum {

    static boolean Prime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return  false;
            }
        }
        return true;

    }

    static void Divisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
