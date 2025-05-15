//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character

        while (t-- > 0) {
            String[] input = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            System.out.println(ob.multiply(arr));
        
System.out.println("~");
}

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        int sum1=0;
        for(int i=0;i<n/2;i++){
            sum+=arr[i];
        }
        for(int i= n/2;i<n;i++){
            sum1+=arr[i];
        }
        int pro=sum*sum1;
        return pro;
    }
}
