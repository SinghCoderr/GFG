// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
            if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0)); // Always keep the first character

        for (int i = 1; i < s.length(); i++) {
            // Only append if current character is different from the previous
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}