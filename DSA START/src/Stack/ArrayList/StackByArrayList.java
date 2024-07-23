package Stack.ArrayList;

import java.util.ArrayList;

public class StackByArrayList {

    public static ArrayList<Integer> stack = new ArrayList<>();
    public void push (int data) {
        stack.add(data);
    }

    public int pop () {
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek () {
        if (stack.size() -1 == 0) {
            return -1;
        }

        return stack.get(stack.size()-1);
    }

    public void printStack(){
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        while (!stack.isEmpty()) {
            System.out.println(pop());
        }

    }
    public static void main(String[] args) {
      StackByArrayList st  = new StackByArrayList();

      st.printStack();
    }
}
