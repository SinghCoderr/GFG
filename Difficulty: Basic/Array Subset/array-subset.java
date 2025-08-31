
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         Map<Integer, Integer> freqA = new HashMap<>();

        // Count frequency of elements in array a
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Check each element in b against frequency map
        for (int num : b) {
            if (!freqA.containsKey(num) || freqA.get(num) == 0) {
                return false;
            }
            freqA.put(num, freqA.get(num) - 1);
        }

        return true;
    }
}
