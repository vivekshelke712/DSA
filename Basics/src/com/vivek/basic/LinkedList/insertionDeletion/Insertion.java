package com.vivek.basic.LinkedList.insertionDeletion;


class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node RemoveHead(Node head) {
        if(head ==null){
            return head;
        }
        Node temp = head;
        head = head.next;
        return head;
    }
    public static Node RemoveLast(Node head){
        if (head ==null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }
    public static int  GetSizeOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp !=null){
            count ++;
            temp = temp.next;
        }
        return  count;
    }
    public static Node RemoveKthElement(Node head,int k){
        int count = GetSizeOfLL(head);
        if(head == null){
            return head;
        }
        else if(k > count){
            return head;
        }
       else if(k == 1){
            RemoveHead(head);
        }
        else if(k == count){
            RemoveLast(head);
        }
        else {
            Node temp = head;
            Node prev = null;
            int cnt = 0;
            while(temp != null){
                cnt ++;
                if(cnt ==k){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }

    public static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
public static Node InsertHead(Node head,int element){
        Node temp = new Node(element,head);
        return temp;

}
public static Node InsertAtLast(Node head,int element){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp = new Node(element);
        return head;
}
    public static void main(String[] args) {
        int arr[] = { 20, 25, 26, 27, 28 };
        Node head = convertArr2LL(arr);
        printLL(head);
        head = InsertHead(head,15);
        printLL(head);
        head = InsertAtLast(head,300);
        printLL(head);
//        head = RemoveHead(head);
//        printLL(head);
//        head = RemoveLast(head);
//        printLL(head);
//        head = RemoveKthElement(head,2);
//        printLL(head);

    }
}

