package LinkedList.Questions;
import LinkedList.LinkedList;
public class DeleteNodeFromLast {
    public static  void DeleteNode (int n, int size) {
        System.out.println(size);
        if (size == n) {
            LinkedList.Head = LinkedList.Head.next;
            return;
        }

        LinkedList.Node temp = LinkedList.Head;
        int i = 1;
        int iToFind = size - n;

        while (i < iToFind) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       DeleteNode(5, ll.Size());
       ll.PrintLinkedList();
    }
}
