class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
        boolean leftValid=(mid==0 || arr[mid]>=arr[mid-1]);
        boolean rightValid=(mid==n-1 || arr[mid]>=arr[mid+1]);
        if(leftValid && rightValid){
            return mid;
        }
        if (mid < n - 1 && arr[mid + 1] > arr[mid]) {
                        low = mid + 1;
                    } 
                    else {
                        high = mid - 1;
                    }
                }

                return -1;
    }
}