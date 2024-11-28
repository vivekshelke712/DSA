package com.vivek.basic.LinkedList;

// Singly Linked List Implementation in Java
public class SinglyLinkedList {

    // Node class to represent each node in the list
    class Node {
        int data;
        Node next;

        // Constructor for Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head = null;

    // Insert at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted.");
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted.");
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        // If the data was not found in the list
        if (temp == null) {
            System.out.println(data + " not found.");
            return;
        }

        // Unlink the node from the list
        prev.next = temp.next;
        System.out.println(data + " deleted.");
    }

    // Search for a node in the list
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println(data + " found.");
                return true;
            }
            temp = temp.next;
        }
        System.out.println(data + " not found.");
        return false;
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the Linked List
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting elements
        list.insert(10);
        list.insert(20);
//        list.insert(30);
//        list.insert(40);
//
//        // Display list
//        list.display();
//
//        // Searching elements
//        list.search(20);
//        list.search(50);
//
//        // Deleting elements
//        list.delete(20);
//        list.display();

//        list.delete(50);
    }
}
