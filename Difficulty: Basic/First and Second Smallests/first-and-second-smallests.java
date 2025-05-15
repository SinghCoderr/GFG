//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(inputLine[i]));
            }

            Solution obj = new Solution();
            int[] product = obj.minAnd2ndMin(arr);
            if (product[0] == -1)
                System.out.println(product[0]);
            else
                System.out.println(product[0] + " " + product[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int n=arr.length;
int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < first_min) {
                second_min = first_min;
                first_min = arr[i];
            } else if (arr[i] < second_min && arr[i] != first_min) {
                second_min = arr[i];
            }
        }

        if (second_min == Integer.MAX_VALUE) {
            return new int[]{-1, -1}; // No valid second minimum found
        }

        return new int[]{first_min, second_min};
    }
}
