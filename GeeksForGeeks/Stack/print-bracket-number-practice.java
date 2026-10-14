import java.util.ArrayList;
import java.util.Stack;

class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int bracketCount = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(bracketCount);
                result.add(bracketCount);
                bracketCount++;
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    result.add(stack.pop());
                }
            }
        }

        return result;
    }
}