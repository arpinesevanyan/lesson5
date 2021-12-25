package com.aca;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//	int [] array = new int [2];
//    array [0] = 5;
//    array [1] = 9;
//        System.out.println(array [0]);
//    }
// minchev 1000
//        int[] array = new int[1000];
//        for (int i = 0; i < 1000; i++){
//            array [i] = i;
//        }
//        for (int i =0; i < 1000; i++ )
//        System.out.println(array [i]);
//    }
//  -20-20 zuyg tver
//    int [] x= new int[21];
//    int y = -20;
//    for (int i = 0; i<21; i++) {
//        x[i] = y;
//        y += 2;
//    }
//        for (int i = 0; i<21; i++)
//        System.out.println(x[i]);
//  100 hat 5i bajanvox tiv
//        int [] x = new int[100];
//        int y = 0;
//        for (int i = 0; i<100; i++) {
//        x[i] = y;
//        y += 5;
//    }
//        for (int i = 0; i<100; i++)
//        System.out.println(x[i]);
//        float[] numbers = new float[1000];
//        Random random = new Random();
//
//        for (int i = 0; i < 1000; i++) {
//            numbers[i] = random.nextFloat() * 1000;
//        }
//        for (int i = 0; i < 1000; i++) {
//            if (numbers[i] > 24.23 && numbers[i] < 345.96) {
//                System.out.println(numbers[i]);
//            }
//        }
//        erankyun
//        int[][] intArray = new int[10][10];
//        int m=10;
//        for (int i =0; i< 10; i++){
//            for (int j =0; j< m; j++){
//                System.out.print(" *");
//            }
//            m--;
//            System.out.println();
//        }
//qarakusi
//        int[][] intArray = new int[10][10];
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        tnayin 1. 2-245 zuyg tver
        Scanner scanner=new Scanner(System.in);
        int p=scanner.nextInt();
        int [] x= new int[p/2];
        int y = 2;
        for (int i = 0; i<p/2; i++) {
            x[i] = y;
            y += 2;
    }
        for (int i = 0; i<p/2; i++)
            System.out.println(x[i]);
    }
}
