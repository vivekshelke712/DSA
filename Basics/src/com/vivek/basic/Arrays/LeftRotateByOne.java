package com.vivek.basic.Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int temp = arr[0];
        int len = arr.length;
        for (int i = 1; i < len  ; i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
