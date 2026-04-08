class Solution {
    public int nthFibonacci(int n) {
        // code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibo(n,dp);
        return (ans);
    }
    static int fibo(int n,int dp[]){
        if(n<=1)
        return n;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}