class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
          int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            // Handle last group which may be smaller than k
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the sub-array from left to right
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}