package Stack.Questions;

import java.util.Stack;

public class PushAtTheBottom {
    public static void PutBottom (Stack<Integer> st, int newData) {
        if (st.isEmpty()) {
            st.push(newData);
            return;
        }

        Stack<Integer> dummy = new Stack<>();

        while (!st.isEmpty()){
           dummy.push(st.pop());
        }

        st.push(newData);

        while (!dummy.isEmpty()) {
            st.push(dummy.pop());
        }
    }
     // Home task optimized the code.
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        PutBottom(st, 4);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
