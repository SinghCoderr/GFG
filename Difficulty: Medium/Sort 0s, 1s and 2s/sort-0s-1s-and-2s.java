//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n=arr.length;
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            count0++;
            else if(arr[i]==1)
            count1++;
            else count2++;
        }
        int index=0;
        for(int i=0;i<count0;i++){
            arr[index++]=0;
        }
        for(int i=0;i<count1;i++){
            arr[index++]=1;
        }
        for(int i=0;i<count2;i++){
            arr[index++]=2;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends