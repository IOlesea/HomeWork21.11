package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class Duplicate {

    static void Tabel(int[] numb){
        int i=0;
        int j=0;

        for(i=0; i<numb.length;i++){
            for(j=i+1;j<numb.length;j++){
                if(numb[i]==numb[j]){
                    numb[j]=0;
                }
            }
        }
        for(int m=0;m<numb.length;m++){
            if(numb[m]!=0){
                int t =numb[m];
                System.out.print(t + " ");
            }
        }
    }

    static void Duplic(int[] arr){

        int i=0;
        int j=0;

        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&& (i!=j)){
                    System.out.print(arr[j] +" ");
                }
            }
        }
    }
}
