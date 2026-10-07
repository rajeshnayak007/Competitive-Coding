import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int stackMiddle(Stack<Integer> st) {
        ArrayList<Integer> list = new ArrayList<>(st);

        int midIndex = (list.size() - 1) / 2;

        return list.get(midIndex);
    }
}