package com.company;


import java.io.File;

public class Task {
    public static int[][] process(int[][] arr2) {
        int [] arr1 = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                    arr1[i] = k - 1;
                }
            }
        }

        int max = arr1[1];
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        return max;
    }