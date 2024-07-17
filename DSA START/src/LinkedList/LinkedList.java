package LinkedList;

public class LinkedList {
    public static class Node {
       public int data;
       public Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node tail;
    public static int size = 0;
    public void AddFirst (int data) {
        size++;
        Node newNode = new Node(data);
        if (Head == null) {
            Head = tail = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;

    }

    public void addLast (int data) {
        size++;
        Node newNode = new Node(data);
        if (Head == null) {
            Head = tail = newNode;
            return;
        }

        Node temp = Head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public void AddMiddle (int data, int prevData) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = tail = newNode;
            return;
        }

        Node temp = Head;

        while (temp.next != null) {
            if (temp.data == prevData) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }

    }
    public int RemoveFirst () {
        if (Head == null ){
            System.out.println("Ll is Empty");
            return Integer.MIN_VALUE;
        }

         int RemoveData =  Head.data;
        Head = Head.next;
        return RemoveData;
    }
      public int RemoveLast () {
        if (Head == null ){
            System.out.println("Ll is Empty");
            return Integer.MIN_VALUE;
        }
        Node temp = Head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

          int RemoveData =  temp.next.data;
         temp.next = null;
         return RemoveData;
    }

    public void PrintLinkedList () {
       try {
           if (Head == null) {
               throw new Error("LinkedList is Empty");
           }
           Node temp = Head;
           while (temp != null) {
               System.out.print(temp.data + " -> ");
               temp = temp.next;
           }
           System.out.println("null");
       } catch (Error e) {
           System.out.println(e);
       }
    }

    public int Size () {
        return size;
    }

    public int IterativeSearch (int key) {
        Node temp = Head;
        int count = 0;
        while (temp.next != null) {
            if (key == temp.data) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public int Recursive (int key, Node root) {
//        Base case
        if (root == null) {
            return -1;
        }

        if (root.data == key) {
            return 0;
        }

     int data = Recursive(key, root.next);
        if (data == -1) {
            return -1;
        }
        return data + 1;
    }

    public void reverse () {
        Node prev = null;
        Node curr = Head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Head = prev;
    }


    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.PrintLinkedList();
       ll.AddFirst(1);
       ll.AddFirst(2);
       ll.AddFirst(3);
       ll.AddFirst(4);
      ll.PrintLinkedList();
//      ll.PrintLinkedList();
        System.out.println(ll.Recursive(10, ll.Head));

    }
}
