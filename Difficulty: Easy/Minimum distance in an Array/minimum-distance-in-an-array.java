class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
            int minDist = Integer.MAX_VALUE;
        int prev = -1;
        int prevValue = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != prevValue) {
                    minDist = Math.min(minDist, i - prev);
                }
                prev = i;
                prevValue = arr[i];
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}