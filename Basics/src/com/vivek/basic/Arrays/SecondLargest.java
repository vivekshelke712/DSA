package com.vivek.basic.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {12 ,23,45,67,445,677,34,45};
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > Largest){
                Largest = arr[i];
            }
        }
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > SecondLargest && arr[i] < Largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
}
