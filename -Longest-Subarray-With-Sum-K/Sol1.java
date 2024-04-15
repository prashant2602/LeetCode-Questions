import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int n=nums.length;
		int l=0;
		int r=0;
		int sum=0;
		int max=0;
		int c=0;
		while(r<n){
			sum=sum+nums[r];
			r++;
			c++;
			if(sum==k){
				if(c>max){
					max=c;
				}
			}
			if(l!=n-1 && r==n){
				l++;
				r=l;
				c=0;
				sum=0;
			}	
		}
		return max;
	}
}
