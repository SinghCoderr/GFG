class Solution {
    public int maxWater(int arr[]) {
        // code here
        int l_max=0;
        int r_max=0;
        int ans=0;
        int n=arr.length;
        int l=0;
        int r=n-1;
       while(l<r){
           l_max=Math.max(l_max,arr[l]);
           r_max=Math.max(r_max,arr[r]);
           if(l_max<r_max){
               ans+=l_max-arr[l];
               l++;
           }
           else{
               ans+=r_max-arr[r];
               r--;
           }
       }
       return ans;
    }
}
