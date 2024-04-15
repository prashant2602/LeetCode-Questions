
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0,right=0;
        int arr[]= new int[m+n];
        int i=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                arr[i]=nums1[left];
                left++;
            }
            else{
                arr[i]=nums2[right];
                right++;
                
            }
            i++;
        }
        while(left<m){
            arr[i]=nums1[left];
            left++;
            i++;
        }
        while(right<n){
            arr[i]=nums2[right];
            right++;
            i++;
        }
        for(int j=0;j<m+n;j++){
            nums1[j]=arr[j];
        }  
    }
}
