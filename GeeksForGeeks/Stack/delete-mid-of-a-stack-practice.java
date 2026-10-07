class Solution {
    private void solve(Stack<Integer> s, int k) {
        if (k == 1) {
            s.pop();
            return;
        }
        
        int temp = s.pop();
        solve(s, k - 1);
        s.push(temp);
    }
    public void deleteMid(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int size = s.size();
        int k = (size / 2) + 1;
        solve(s, k);
    }
}