class Solution {
    public boolean wordPattern(String s, String ss) {
        HashMap<Character, String> map = new HashMap<>();
        String[] details = ss.split(" ");
        if(s.length() != details.length){
            return false;
        }
            for (int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))){
                    String str = map.get(s.charAt(i));
                    if(!str.equals(details[i])){
                        return false;
                    }
                }
                else if(map.containsValue(details[i])){
                    return false;
                }
                else{
                    map.put(s.charAt(i),details[i]);
                }
            }
            
            return true;
    }
}
