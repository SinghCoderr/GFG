//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int maxSubstring(String S) {
        // code here
           int maxDiff = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < S.length(); i++) {
            int val = S.charAt(i) == '0' ? 1 : -1;

            currSum += val;
            maxDiff = Math.max(maxDiff, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxDiff;
    }
}