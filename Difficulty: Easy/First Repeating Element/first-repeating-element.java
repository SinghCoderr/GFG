class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
       HashMap<Integer,Integer>map=new HashMap<>();
       int  n=arr.length;
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }
           else{
               map.put(arr[i],1);
           }
       }
       for(int i=0;i<n;i++){
           if(map.get(arr[i])>1){
           return i+1;
       }
       }
       return -1;
    }
}
