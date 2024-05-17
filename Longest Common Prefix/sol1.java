class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String first = strs[0];
       String end = strs[strs.length-1];
       StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(first.length(),end.length());i++){
            if(first.charAt(i)!=end.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
