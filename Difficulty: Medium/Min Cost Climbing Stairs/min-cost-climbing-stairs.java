//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
          int n = cost.length;

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(MinCost(0, cost, dp), MinCost(1, cost, dp));
        
    }
    static int MinCost(int i,int cost[],int dp[]){
        int n=cost.length;
        if(i>=n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
 int oneStep = MinCost(i + 1, cost, dp);
        int twoStep = MinCost(i + 2, cost, dp);

        dp[i] = cost[i] + Math.min(oneStep, twoStep);

        return dp[i];
    }
};