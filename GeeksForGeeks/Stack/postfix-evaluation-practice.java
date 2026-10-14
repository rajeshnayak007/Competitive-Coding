import java.util.Stack;

class Solution {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String s : arr) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")) {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (s) {
                    case "+":
                        stack.push(val1 + val2);
                        break;
                    case "-":
                        stack.push(val1 - val2);
                        break;
                    case "*":
                        stack.push(val1 * val2);
                        break;
                    case "/":
                        stack.push(Math.floorDiv(val1, val2));
                        break;
                    case "^":