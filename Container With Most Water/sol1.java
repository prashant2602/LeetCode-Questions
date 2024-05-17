class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        int maxArea=0;
        while(i!=j){
            if(height[i]>height[j]){
                area=height[j]*(j-i);
                j--;
            }
            else{
                area=height[i]*(j-i);
                i++;
            }
            if(maxArea<area){
                maxArea=area;
            }   
        }
        return maxArea;
    }
}
