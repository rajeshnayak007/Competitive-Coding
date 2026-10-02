class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int n = arr.length - 2;
        int[] result = new int[2];
        int count = 0;
        boolean[] visited = new boolean[n + 1];

         for (int i = 0; i < arr.length; i++) {
        int num = arr[i];
       if (visited[num]) {
         result[count++] = num;
        if (count == 2) {
            break;
        }
         } else {
            visited[num] = true;
             }
          }

        return result;
    }
}