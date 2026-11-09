package homeworks.BraceChecker;

import java.util.Stack;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else if (current == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed } but nothing opened at " + i);
                    return;
                }
                char last = stack.pop();
                if (last != '{') {
                    System.out.println("Error: opened " + last + " but closed } at " + i);
                }
            } else if (current == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed ] but nothing opened at " + i);
                    return;
                }
                char last = stack.pop();
                if (last != '[') {
                    System.out.println("Error: opened " + last + " but closed ] at " + i);
                }
            } else if (current == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed ) but nothing opened at " + i);
                    return;
                }
                char last = stack.pop();
                if (last != '(') {
                    System.out.println("Error: opened " + last + " but closed ) at " + i);
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: opened " + stack.peek() + " but never closed.");
        } else {
            System.out.println("No errors");
        }
    }
}

