class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long totalSum= (long) n*(n+1)/2;
        long actualSum=0;
        for(int i=0;i<arr.length;i++){
            actualSum = actualSum +arr[i];
        }
        return(int)(totalSum-actualSum);
    }
}