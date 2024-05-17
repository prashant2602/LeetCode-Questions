class Solution {
    public String reverseWords(String s) {
        String details[]=s.trim().split("\\s+");
        String res="";
        for(int i=details.length-1;i>=0;i--){
            if(i!=0){
                res=res+details[i]+" ";
            }
            else{
                res=res+details[i];
            }
            
        }
        return res;
    }
}
