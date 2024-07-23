package LinkedList;

public class Q1 {
    public static  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void printList(Node dummy) {
        if (dummy == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = dummy;

        while (temp  != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node isFound (Node l, Node r) {
        if (l == null || r == null) {
            return new Node(-1);
        }

        Node head1 = l;
        Node head2 = r.next;

        while (head1 != null && head2 != null) {
            head1 = head1.next;
            head2 = head2.next;

            if (head1.data == head2.data) {
                return  head1;
            }
        }

        return new Node(-1);
    }

    public static Node getIntersectionNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }

        Node ptr1 = head1;
        Node ptr2 = head2;

        // Traverse both lists, switch heads when the end is reached
        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }

        // Either intersection node or null if no intersection
        return ptr1;
    }

    public static void main(String[] args) {
      Node ll = new Node(1);
      Node l2 = new Node(4);
      ll.next = new Node(2);
      ll.next.next = new Node(3);
      ll.next.next.next = new Node(6);
      ll.next.next.next.next = new Node(7 );
      l2.next = new Node(5);
      l2.next.next =  ll.next.next.next;
      printList(l2);
        System.out.println(getIntersectionNode(l2, ll).data);
    }
}
