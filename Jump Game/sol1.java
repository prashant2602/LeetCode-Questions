class Solution {
    public boolean canJump(int[] nums) {
        int current = nums.length-2;
        int goal = nums.length-1;

        if(nums[0]==0 && nums.length==1){
            return true;
        }
        if(nums[0]==0){
            return false;
        }

        while(goal>=0){
            if(goal==0 && nums[0]>0){
                return true;
            }
            if(nums[current]+current>=goal){
                goal=current;
                current--;
            }
            else{
                current--;
                if(current<0){
                    return false;
                }
            }
        }
        return true;
    }
}
