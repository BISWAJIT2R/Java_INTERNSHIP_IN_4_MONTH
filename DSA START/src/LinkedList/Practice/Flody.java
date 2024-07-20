package LinkedList.Practice;

import java.util.LinkedList;

public class Flody {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void PrintLinkedList () {
        try {
            if (head == null) {
                throw new Error("LinkedList is Empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        } catch (Error e) {
            System.out.println(e);
        }
    }

    public boolean isCycle () {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle () {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean isTrue = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isTrue =true;
                break;
            }
        }

        if (!isTrue) {
            System.out.println("Cycle not found!!");
            return;
        }

        slow = head;
        Node  prev = null;

        if (slow == fast) {
            while (fast.next != null) {
                    fast = fast.next;
            }
            fast.next = null;
            return;
        }



        while (slow  != fast) {
            prev = fast;
          slow = slow.next;
          fast = fast.next;

        }

        prev.next  = null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        Flody fd =  new Flody();
//        fd.removeCycle();
        fd.PrintLinkedList();
//        System.out.println(fd.isCycle());

    }
}
