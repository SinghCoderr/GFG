//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
           int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0, currSum = 0;

        while (end < n) {
            // Expand the window
            while (currSum <= x && end < n) {
                currSum += arr[end++];
            }

            // Shrink the window
            while (currSum > x && start < n) {
                minLen = Math.min(minLen, end - start);
                currSum -= arr[start++];
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
