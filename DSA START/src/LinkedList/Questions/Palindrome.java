package LinkedList.Questions;

import java.util.LinkedList;

public class Palindrome {
     public void printList (LinkedList<Character> ch) {
         if (ch == null) {
             System.out.println("ll is empty");
             return;
         }

         while (ch != null) {

         }
     }
    public static void main(String[] args) {
        LinkedList<Character> ch = new LinkedList<>();
        ch.addLast('a');
        ch.addLast('a');
        ch.addLast('b');
        ch.addLast('b');
        ch.addLast('a');
        ch.addLast('a');
        System.out.println(ch);
    }
}
