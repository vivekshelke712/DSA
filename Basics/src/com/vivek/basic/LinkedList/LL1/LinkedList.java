package com.vivek.basic.LinkedList.LL1;
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static Node convertArr2LL (int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteHead(Node head){
        if(head == null) {
            return head;
        }
        Node temp = head;
        temp = temp.next;
        return temp;
    }
    public static Node deleteTail(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node temp  = head;
       while(temp.next.next != null){
           temp = temp.next;
       }
       temp.next = null;


        return head;
    }
    public static Node deleteKthElement(Node head,int pos){
        if(head == null){
            return head;
        }
        if (pos == 1){
            deleteHead(head);
        }
        Node prev = null;
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            if(cnt == pos){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node insertHead(Node head,int ele){
        return new Node(ele,head);
    }
    public static Node insertAtLast(Node head,int ele){
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                Node newNode = new Node(ele);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
    public static Node InsertAtKthPos(Node head,int pos,int ele){
        if(head == null){
            return head;
        }
        if(pos == 1){
            insertHead(head,ele);
        }
        int cnt = 0;
        Node temp = head;

        while(temp != null){
            cnt++;
            if(cnt == pos -1){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void PrintLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node head = convertArr2LL(arr);
        PrintLL(head);
        head = deleteHead(head);
        PrintLL(head);
        head = deleteTail(head);
        PrintLL(head);
        head = deleteKthElement(head,3);
        PrintLL(head);
        head = insertHead(head,1);
        PrintLL(head);
        head = insertAtLast(head,10);
        PrintLL(head);
        head = InsertAtKthPos(head,3,100);
        PrintLL(head);

    }
}
