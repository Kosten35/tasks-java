package com.budzko;

import java.util.Random;
import java.util.Scanner;

 class RandomNumbers {
     Scanner in = new Scanner(System.in);
     Random random = new Random();
     private int N = 0;
     private int[] arrayN;

     public void setN() {
         System.out.print("enter number of random numbers: ");
         N = in.nextInt();
         arrayN = new int[N];

     }

     public int getN() {
         return N;
     }

     public void setArrayN(int N) {
         for (int i = 0; i < N; i++) {
             arrayN[i] = random.nextInt();
         }
     }

     public void showArray() {
         for (int i = 0; i < arrayN.length; i++) {
             System.out.print(arrayN[i] + " ");
         }
         System.out.println();
     }

     public void showArrayLn() {
         for (int i = 0; i < arrayN.length; i++) {
             System.out.println(arrayN[i]);
         }
     }
 }

