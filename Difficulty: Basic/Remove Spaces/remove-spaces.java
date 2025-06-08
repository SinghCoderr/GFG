// User function Template for Java
class Solution {

    String modify(String s) {
        // your code here
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {  
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}