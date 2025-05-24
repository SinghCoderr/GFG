// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        int n=arr.length;
        int uniqueCount=1;
        int prev=arr[0];
         if (k == 1) {
            return prev;
        }
        for(int i=1;i<n;i++){
            if(arr[i]!=prev){
                uniqueCount++;
                prev=arr[i];
            }
            if(uniqueCount==k){
                return arr[i];
            }
        }
        return -1;
    }
}
