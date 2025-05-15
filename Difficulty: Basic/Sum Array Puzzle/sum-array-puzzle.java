//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public void sumArray(List<Integer> arr) {
        // Your Code goes here
                int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, totalSum - arr.get(i));
        }
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Solution sol = new Solution();
        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            List<Integer> arr = new ArrayList<>();
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }
            sol.sumArray(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends