// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        StringBuilder result = new StringBuilder();

        // Append every alternate character (even indices)
        for (int i = 0; i < S.length(); i += 2) {
            result.append(S.charAt(i));
        }

        return result.toString();
    }
}