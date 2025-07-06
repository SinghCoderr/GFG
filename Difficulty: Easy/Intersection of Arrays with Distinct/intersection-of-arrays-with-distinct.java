class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        Set<Integer> s = new HashSet<>();
        for (int num : a) {
            s.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : b) {
            if (s.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.size();
}
}