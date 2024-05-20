package LEETCODE.Day3.Medium;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class ReverseSum {
    public static void main(String[] args) {
         SinglyLinkedList sc = new SinglyLinkedList();
         Node n = new Node(1);
         n.next = new Node(2);
         n.next.next = new Node(3);
         sc.printList();
        System.out.println();
        sc.reverse();

    }
}
