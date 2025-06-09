//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int missingNum(int arr[]) {
        // code here
      HashMap<Integer, Boolean> map = new HashMap<>();
int  n=arr.length+1;
        for (int num : arr) {
            map.put(num, true);
        }

    
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }

        // If no number is missing
        return -1;
    }
    }
