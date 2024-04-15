class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
        int n= nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<n){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
                count=1;
            }
            else if(arr.contains(nums[i]) && count==1){
                arr.add(nums[i]);
                count++;
            }
            else{
                count++;
            }  
            i++;
        }
        for(int j=0;j<arr.size();j++){
            nums[j]=arr.get(j);
        }
        return arr.size(); 
    }
}
