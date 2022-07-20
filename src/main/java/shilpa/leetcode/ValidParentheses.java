package shilpa.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Here will all the opening brackets be saved.
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //Push the opening brackets into the stack
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stk.push(s.charAt(i));
            else {
				/*Check if Stack is empty, else check if the
				  closing bracket matches the next opening one.*/
                if (stk.empty()) return false;
                switch (s.charAt(i)) {
                    case ')' -> {
                        if (stk.pop() != '(') return false;
                    }
                    case ']' -> {
                        if (stk.pop() != '[') return false;
                    }
                    case '}' -> {
                        if (stk.pop() != '{') return false;
                    }
                }
            }
        }
        //return true if the stack is empty, else false
        return stk.empty();
    }
    public static void main(String[] args){
        System.out.println( ValidParentheses.isValid("{}"));

    }
}