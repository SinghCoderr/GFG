// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer>hs=new HashSet<>();
        for(int num:a){
            hs.add(num);
        }
        for(int num:b){
            hs.add(num);
        }
       
        ArrayList<Integer> result = new ArrayList<>(hs);
        Collections.sort(result); 

        return result;
    }
}
