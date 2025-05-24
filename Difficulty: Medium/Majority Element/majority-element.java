// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // code here
       if (arr == null || arr.length == 0) return -1; 

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; 
    }
   
}