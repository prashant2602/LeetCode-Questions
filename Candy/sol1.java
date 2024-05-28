//Greedy Algorithm - One Pass method
class Solution {
    public int candy(int[] ratings) {
        int candyArr[] = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            candyArr[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                candyArr[i]=candyArr[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(candyArr[i]<=candyArr[i+1]){
                    candyArr[i]=candyArr[i+1]+1;
                }
            }
            
        }
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            sum=sum+candyArr[i];
        }
        return sum;
    }
}
