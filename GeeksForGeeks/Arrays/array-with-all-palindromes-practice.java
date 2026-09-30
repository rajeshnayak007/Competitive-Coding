class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int num=0;num<arr.length;num++){
            if(!isPalindrome(arr[num])){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindrome(int n){
        int org=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return org == rev;
    }
}