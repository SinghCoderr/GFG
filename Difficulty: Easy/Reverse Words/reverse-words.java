//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine();        // Consume the newline character after reading the integer

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the input string

            // Remove surrounding quotes from the string
            String str = s.substring(1, s.length() - 1);

            Solution obj = new Solution(); // Create an object of the Solution class
            String ans = obj.reverseWords(str); // Reverse the words in the string

            // Print the result with surrounding quotes
            System.out.println("\"" + ans + "\"");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        int n=s.length();
        int i=n-1;
            StringBuilder result = new StringBuilder();

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            int j = i;
            // Find the start of the word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Append the word to result
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(s.substring(j + 1, i + 1));

            i = j - 1;
        }

        return result.toString();

    }
}
