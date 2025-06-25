//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String s) {
HashSet<Character>hs=new HashSet<>();
    StringBuilder result = new StringBuilder();
    
int n=s.length();
for(int i=0;i<n;i++){
    char ch=s.charAt(i);
    if(!hs.contains(ch)){
        hs.add(ch);
          result.append(ch);
    }
}
  return result.toString();
    }
}