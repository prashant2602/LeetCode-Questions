class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target-nums[i];
            if(h.containsKey(diff)) {
                int j=h.get(diff);
                return new int[] {j, i};
            }
            h.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
