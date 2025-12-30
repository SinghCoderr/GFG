class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int sum=0;
        int max_sum=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0)
            sum=0;
        }
        return max_sum;
    }
}
