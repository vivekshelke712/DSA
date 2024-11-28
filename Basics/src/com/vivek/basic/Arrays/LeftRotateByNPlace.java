package com.vivek.basic.Arrays;

import java.util.Arrays;

public class LeftRotateByNPlace {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        int d = 3;
        int len = arr.length;
        int[] temp = new int[3];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        int j = 0;
        for (int i = d; i < len  ; i++) {
            arr[j] = arr[i];
            j++;
        }
        int k = 0;
        for (int i = len-d; i < len ; i++) {
            arr[i] = temp[k];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
