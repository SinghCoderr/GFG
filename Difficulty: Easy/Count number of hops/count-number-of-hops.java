// User function Template for Java

class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);// add your code here
        int ans=CountHops(n,dp);
        return ans;
    }
    static int CountHops(int n,int dp[]){
        if(n==0 ||n==1)
        return 1;
        if(n==2)
        return 2;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=CountHops(n-1,dp)+CountHops(n-2,dp)+CountHops(n-3,dp);
    }
}
