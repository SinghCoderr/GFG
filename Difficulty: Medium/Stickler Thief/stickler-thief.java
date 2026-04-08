class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        int val=maxLoot(0,arr,dp);
        return val;
    }
    static int maxLoot(int i,int arr[],int dp[]){
        if(i>=arr.length)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int pick=arr[i]+maxLoot(i+2,arr,dp);
        int skip=maxLoot(i+1,arr,dp);
        return dp[i]= Math.max(pick,skip);

    }
}