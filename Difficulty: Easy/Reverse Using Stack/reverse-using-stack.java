class Solution {
    public String reverse(String S) {
        // code here
         return reverseString(S);
    }

    static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Step 2: Pop and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}