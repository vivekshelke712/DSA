package com.vivek.basic.LinkedList;

class Node{
    int data;
    Node1 next;
    Node(int data1, Node1 next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
         this.data = data1;
         this.next = null;
    }
}

public class LL {
    public static void main(String[] args) {
        int[] arr = {2,5,8,7};
        Node1 x = new Node1(arr[0]);
        System.out.println(x.data);
        Node1 y = x;
        System.out.println(y);
    }
}
