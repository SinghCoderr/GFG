// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
      int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) first = i;
                last = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }
}
