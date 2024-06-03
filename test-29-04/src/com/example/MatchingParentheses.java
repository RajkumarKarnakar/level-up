package com.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class MatchingParentheses {
    public static void main(String[] args) {
        System.out.println("Is Complete String: " + hasMatchingParenthesis("((<>))"));
    }

    static boolean hasMatchingParenthesis(String string) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockSymbols = Map.of(
                ')', '(',
                ']', '[',
                '>', '<'
        );

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (blockSymbols.containsValue(current)) {
                stack.push(current);
                continue;
            }
            if (blockSymbols.containsKey(current) &&
                    stack.isEmpty() ||
                    stack.pop() != blockSymbols.get(current)
            ) {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
