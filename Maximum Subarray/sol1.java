class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0;i<nums.length;i++){
            profit=profit+nums[i];
            if(profit>max_sum){
                max_sum=profit;
            }
            if(profit<0){
                profit=0;
            }
        }
        return max_sum;
    }
}
