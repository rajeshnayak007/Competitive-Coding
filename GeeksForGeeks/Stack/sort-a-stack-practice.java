class Solution {
    public void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        sortStack(st);
        sortedInsert(st, top);
    }

    private void sortedInsert(Stack<Integer> st, int element) {
        if (st.isEmpty() || st.peek() < element) {
            st.push(element);
            return;
        }
        int top = st.pop();
        sortedInsert(st, element);
        st.push(top);
    }
}