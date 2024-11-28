// Node class to represent each element in the LinkedList
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

// Singly Linked List class
class SLL {
    private Node head;
    private int count;

    // Constructor to initialize an empty list
    public SLL() {
        this.head = null;
        this.count = 0;
    }

    // Insert a node at the beginning
    public void insertAtFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    // Insert a node at the end
    public void insertAtLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        count++;
    }

    // Insert a node at a specific position
    public void insertAtPos(int val, int pos) {
        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(val);
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == count + 1) {
            insertAtLast(val);
        } else {
            Node cur = head;
            for (int i = 1; i < pos - 1; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            count++;
        }
    }

    // Display all elements in the list
    public void display() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " -> ");
                cur = cur.next;
            }
            System.out.println("null");
        }
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            count--;
        }
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            count--;
        } else {
            Node cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next = null;
            count--;
        }
    }

    // Delete a node at a specific position
    public void deleteAtPos(int pos) {
        if (pos < 1 || pos > count) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else {
            Node cur = head;
            for (int i = 1; i < pos - 1; i++) {
                cur = cur.next;
            }
            Node temp = cur.next;
            cur.next = temp.next;
            temp.next = null;
            count--;
        }
    }

    // Search for a value in the list
    public void search(int val) {
        Node cur = head;
        boolean found = false;
        while (cur != null) {
            if (cur.data == val) {
                found = true;
                break;
            }
            cur = cur.next;
        }

        if (found) {
            System.out.println("Found: " + val);
        } else {
            System.out.println("Not found");
        }
    }

    // Get the count of elements
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertAtFirst(30);
        list1.insertAtFirst(20);
        list1.insertAtFirst(10);
        list1.insertAtPos(40, 3);
        list1.insertAtPos(50, 2);
        list1.deleteFirst();
        list1.display();
        System.out.println("Count: " + list1.getCount());
    }
}
