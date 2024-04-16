class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replace(" ","");
        s=s.toLowerCase();
        StringBuilder input = new StringBuilder();
        input.append(s);
        input.reverse();
        String str=new String(input);
        if(str.equals(s)){
            return true;
        }
        return false;
    }
}
