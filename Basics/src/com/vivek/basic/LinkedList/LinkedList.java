package com.vivek.basic.LinkedList;

class Node1 { // Renamed from Node to Node1
    int data;
    Node1 next;

    Node1(int data1, Node1 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node1(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList {
    private static Node1 ConvertArr2LL(int[] arr) {
        Node1 head = new Node1(arr[0]); // Create the head node
        Node1 mover = head;            // Initialize a pointer to traverse and build the list
        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]); // Create a new node for the current element
            mover.next = temp;             // Link the current node to the new node
            mover = temp;                  // Move the pointer to the new node
        }
        return head; // Return the head of the linked list
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};
        Node1 head = ConvertArr2LL(arr); // Use the correct method name (uppercase C)
        System.out.println(head.data);  // Print the data of the head node
    }
}
