// User function Template for Java
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
    if (key >= 0 && key < arr.length) {
            return arr[key];  // Return value at index
        } else {
            return -1; // Invalid index
        }
    }
}