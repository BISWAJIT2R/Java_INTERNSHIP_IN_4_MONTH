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

    public boolean isCycle () {
        if( Head == null || Head.next == null) {
            return false;
        }

        Node slow;
        Node fast;
        fast = slow = Head;

        while (fast != null && fast.next != null) {
            slow =slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle () {

        if( Head == null || Head.next == null) {
            return;
        }

        Node slow;
        Node fast;

        slow = fast = Head;

        boolean Cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Cycle = true;
                break;
            }
        }

        if (!Cycle) {
            System.out.println("No cycle found");
            return;
        }

        Node prev = null;
        slow = Head;

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public boolean isPalindrome() {
        if (Head == null) {
            System.out.println("ok");
            return false;
        }

        Node mid = foundMid(Head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node  right = prev;
        Node  left = Head;

        while (right  != null) {
            if (right.data != left.data) {
                System.out.println("34");
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node foundMid (Node head) {
        if (head == null) {
            return new Node(-1);
        }

        Node slow;
        Node fast;

        slow =  head;
        fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast  = fast.next.next;
        }

        return  slow;
    }

    public Node margeSort (Node head) {
         if (head == null || head.next == null) {
             return head;
         }

         Node isMid = foundMid(head);
         Node isRight = isMid.next;
         isMid.next = null;

         Node left = margeSort(head);
         Node right = margeSort(isRight);

         return Sorted(left, right);
    }

    public Node Sorted (Node left, Node right)  {
        Node margedLL = new Node(-1);
        Node dummy = margedLL;
        Node head1 = left;
        Node head2 = right;

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                dummy.next  = head2;
                head2 = head2.next;
                dummy = dummy.next;
            }else {
                dummy.next  = head1;
                head1 = head1.next;
                dummy = dummy.next;
            }
        }

        while (head1 != null) {

            dummy.next  = head1;
            head1 = head1.next;
            dummy = dummy.next;
        }

        while (head2 != null) {
            dummy.next  = head2;
            head2 = head2.next;
            dummy = dummy.next;

        }

        return margedLL.next;
    }

    public Node ZigZag (Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node isMid = foundMid(head);
        Node isRight = isMid.next;
        isMid.next  = null;

        Node prev = null;
        Node curr = isRight;
        Node isNext;

        while (curr != null) {
            isNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = isNext;
        }

       return ZigZagCombaine(head, prev);
    }

    public Node ZigZagCombaine(Node left, Node right) {
        Node ZigZagll = new Node(-1);
        Node dummy = ZigZagll;
        Node head1 = left;
        Node head2 = right;
        Node head1Curr;
        Node head2Curr;
        while (head1 != null && head2 != null) {
            dummy.next = head1;
            head1Curr = head1.next;
            dummy.next.next = head2;
            head2Curr = head2.next;
            head1 = head1Curr;
            head2 = head2Curr;
            dummy = dummy.next.next;
        }

        while (head1 != null) {
            dummy.next = head1;
            head1=head1.next;
            dummy = dummy.next;
        }
        while (head2 != null) {
            dummy.next = head2;
            head2=head2.next;
            dummy = dummy.next;
        }

        return ZigZagll.next;
    }
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.addLast(1);
      ll.addLast(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.addLast(5);
      ll.addLast(6);
      ll.PrintLinkedList();
      Head = ll.ZigZag(Head);
      ll.PrintLinkedList();
    }
}
