// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        HashSet<Character>hs=new HashSet<>();
    StringBuilder result = new StringBuilder();
    
int n=s.length();
for(int i=0;i<n;i++){
    char ch=s.charAt(i);
    if(!hs.contains(ch)){
        hs.add(ch);
          result.append(ch);
    }
}
  return result.toString();
    }
}
