package com.company;

import javax.xml.bind.SchemaOutputResolver;

public class PrintArray {
    static String[][] arr = new String[4][4];

    static void PrintA() {
        System.out.println("a)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void PrintB() {
        System.out.println("b)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //static void PrintC() {
    //    for (int i = arr.length-1; i>=0; i--) {
    //        for (int j=arr[i].length-1; j <j-1; j--) {
 //                   System.out.print("*");
//            }
  //          System.out.println();
  //      }
  //  }


    static void PrintD() {
        System.out.println("d)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }


    //static void PrintE() {
    //    for (int i = arr.length; i == 0; i--) {
    //        for (int j = arr.length; j == 0; j--) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //    }
   // }


    static void PrintF() {
        System.out.println("f)");
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < arr[i].length - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void PrintE1() {
        System.out.println("e1)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j < arr[i].length - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //static void PrintF1() {
    //    for (int i = arr.length-1; i == 0 ; i--) {
    //        for (int j = arr[i].length-1; j == 0; j--) {
    //          //  if (i == j) {
    //                System.out.print("*");
    //          //  } else
    //          //      System.out.print(" ");

           // }
   //         System.out.println();
   //     }
   // }

    static void PrintG() {
        System.out.println("g)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                  if (j != 2) {
                System.out.print("*");
                  } else
                      System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void PrintI() {
        System.out.println("i)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if ((i==1&&j==1)||(i==1&&j==2)||(i==2&&j==1)||(i==2&&j==2)) {
                    System.out.print(" ");
                } else
                    System.out.print("*");

            }
            System.out.println();
        }
    }

    static void PrintJ() {
        System.out.println("j)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if ((i==1&&j==1)||(i==1&&j==2)||(i==2&&j==1)||(i==2&&j==2)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}