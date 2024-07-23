package Stack.LinkedList;

public class StackByLinkedList {
    public static class Node   {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static class Stack {
        public void push (int data) {
            Node newData = new Node(data);
            if  (head == null) {
                head = newData;
                return;
            }
            newData.next = head;
            head = newData;
        }

        public int pop () {
            if(head == null) {
                System.out.println("stack is empty");
                return -1;
            }

            Node removeNode = head;
            head = head.next;
            return removeNode.data;
        }

        public int peek () {
            if(head == null) {
                System.out.println("stack is empty");
                return -1;
            }

            return head.data;
        }

        public void printStack () {
            if(head == null) {
                System.out.println("stack is empty");
                return;
            }

            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                pop();
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
       Stack st = new Stack();
       st.push(1);
       st.push(2);
       st.push(3);
       st.printStack();
    }
}
