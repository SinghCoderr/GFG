//{ Driver Code Starts
import java.util.*;

class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
         int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for ( j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) break;
            }
            if (j == m) return i; 
        }

        return -1;
    }
}
