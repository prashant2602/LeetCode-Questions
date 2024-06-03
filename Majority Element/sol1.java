class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int el=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        return el;
    }
}
