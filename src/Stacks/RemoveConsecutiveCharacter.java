package Stacks;

import java.util.Stack;

public class RemoveConsecutiveCharacter {
    public String removeConsecutiveCharacter(String s) {
        if (s == null || s.length() == 0) return s;

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // Push characters to first stack (skip consecutive duplicates)
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (st1.isEmpty() || st1.peek() != ch) {
                st1.push(ch);
            }
        }

        // Reverse into second stack
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        while (!st2.isEmpty()) {
            sb.append(st2.pop());
        }

        return sb.toString();

    }
}
