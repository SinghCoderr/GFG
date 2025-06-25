// User function Template for Java

class Sol {
    Boolean check(String s) {
        // your code here
        int n=s.length();
      if (n==1) return true;  
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }
}