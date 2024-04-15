class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
            else{
                c++;
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();      
    }
}
