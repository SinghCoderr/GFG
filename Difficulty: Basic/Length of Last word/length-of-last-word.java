//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            int ans = ob.findLength(s);
            System.out.println(ans);
        
System.out.println("~");
}
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int findLength(String s) 
    { 
        // code her
        int n=s.length();
        int i=n-1;;
        int count=0;
                while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

       while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
       }
        return count;
    
    }
}