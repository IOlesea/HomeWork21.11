package com.company;

public class Multiplication {

    public static void Mult() {

        int[][] tabel = new int[10][10];
        tabel[0][0] = 1;
        tabel[0][1] = 2;
        tabel[0][2] = 3;
        tabel[0][3] = 4;
        tabel[0][4] = 5;
        tabel[0][5] = 6;
        tabel[0][6] = 7;
        tabel[0][7] = 8;
        tabel[0][8] = 9;

        tabel[1][0] = 1;
        tabel[1][1] = 2;
        tabel[1][2] = 3;
        tabel[1][3] = 4;
        tabel[1][4] = 5;
        tabel[1][5] = 6;
        tabel[1][6] = 7;
        tabel[1][7] = 8;
        tabel[1][8] = 9;

        tabel[2][0] = 1;
        tabel[2][1] = 2;
        tabel[2][2] = 3;
        tabel[2][3] = 4;
        tabel[2][4] = 5;
        tabel[2][5] = 6;
        tabel[2][6] = 7;
        tabel[2][7] = 8;
        tabel[2][8] = 9;

        tabel[3][0] = 1;
        tabel[3][1] = 2;
        tabel[3][2] = 3;
        tabel[3][3] = 4;
        tabel[3][4] = 5;
        tabel[3][5] = 6;
        tabel[3][6] = 7;
        tabel[3][7] = 8;
        tabel[3][8] = 9;

        tabel[4][0] = 1;
        tabel[4][1] = 2;
        tabel[4][2] = 3;
        tabel[4][3] = 4;
        tabel[4][4] = 5;
        tabel[4][5] = 6;
        tabel[4][6] = 7;
        tabel[4][7] = 8;
        tabel[4][8] = 9;

        tabel[5][0] = 1;
        tabel[5][1] = 2;
        tabel[5][2] = 3;
        tabel[5][3] = 4;
        tabel[5][4] = 5;
        tabel[5][5] = 6;
        tabel[5][6] = 7;
        tabel[5][7] = 8;
        tabel[5][8] = 9;

        tabel[6][0] = 1;
        tabel[6][1] = 2;
        tabel[6][2] = 3;
        tabel[6][3] = 4;
        tabel[6][4] = 5;
        tabel[6][5] = 6;
        tabel[6][6] = 7;
        tabel[6][7] = 8;
        tabel[6][8] = 9;

        tabel[7][0] = 1;
        tabel[7][1] = 2;
        tabel[7][2] = 3;
        tabel[7][3] = 4;
        tabel[7][4] = 5;
        tabel[7][5] = 6;
        tabel[7][6] = 7;
        tabel[7][7] = 8;
        tabel[7][8] = 9;

        tabel[8][0] = 1;
        tabel[8][1] = 2;
        tabel[8][2] = 3;
        tabel[8][3] = 4;
        tabel[8][4] = 5;
        tabel[8][5] = 6;
        tabel[8][6] = 7;
        tabel[8][7] = 8;
        tabel[8][8] = 9;

        tabel[9][0] = 1;
        tabel[9][1] = 2;
        tabel[9][2] = 3;
        tabel[9][3] = 4;
        tabel[9][4] = 5;
        tabel[9][5] = 6;
        tabel[9][6] = 7;
        tabel[9][7] = 8;
        tabel[9][8] = 9;

        for (int i = 1; i < tabel.length; i++) {
            for (int j = 1; j < tabel[i].length; j++) {
                int prod = Math.multiplyExact(i, j);
                if (prod >= 10) {
                    System.out.print(prod + " ");
                } else {
                    System.out.print(prod + "  ");
                }
            }
            System.out.println();
        }
    }
}