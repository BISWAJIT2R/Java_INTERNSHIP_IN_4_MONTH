package Stack.Questions;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i <  str.length() ; i++) {
             st.push(str.charAt(i));
         }

         while (!st.isEmpty()) {
             sb.append(st.pop());
         }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "";
        System.out.println(reverse(str));
    }
}
