class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int l=0,r=n-1,j=0;
        while(j<=r){
            if(arr[j]==1){
            j++;
            }
            else if(arr[j]==2){
                // swap(arr[j],arr[r]);
                int t=arr[j];
                arr[j]=arr[r];
                arr[r]=t;
                r--;
            }
            else{
                // swap(arr[j],arr[l]);
                int temp=arr[j];
                arr[j]=arr[l];
                arr[l]=temp;
                l++;
                j++;
            }
        }
    }
}