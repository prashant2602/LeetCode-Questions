class Solution {
    public int lengthOfLastWord(String s) {
        String details[]=s.split("\\s+");
        int n = details.length;
        int len = details[n-1].length();
        return len;
    }
}
