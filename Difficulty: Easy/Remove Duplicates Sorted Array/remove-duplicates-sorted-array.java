//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();
            int len = obj.removeDuplicates(arr);
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public int removeDuplicates(int[] arr) {
        // Code Here
       int n=arr.length;
        int j = 0;  // Pointer for the temp array
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {  
                arr[j] = arr[i];  
                j++;  
            }
        }
        
      
        arr[j] = arr[n - 1];
        j++;  
        return j;
    }
}