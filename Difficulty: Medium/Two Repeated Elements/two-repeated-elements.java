// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (map.get(arr[i]) == 1 && index < 2) {
                    result[index++] = arr[i];
                }
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return result;
    }
}