class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int n=nums.length;
        int count=0;
        while(i<n){
            if(nums[i]==val){
                nums[i]=55;
                count++;
            }
            i++;
        }
        count=i-count;
        Arrays.sort(nums);
        return count;
    }
}
