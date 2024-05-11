class Solution {
    public boolean wordPattern(String s, String ss) {
        HashMap<Character, String> a = new HashMap<>();
        String[] details = ss.split(" ",);
        if(s.length() != details.length){
            return false;
        }
            for (int i = 0; i < s.length(); i++) {
                if(a.containsKey(s.charAt(i))){
                    String n = a.get(s.charAt(i));
                    if(!n.equals(split_string[i])){
                        return false;
                    }
                }
                else if(a.containsValue(split_string[i])){
                    return false;
                }
                else{
                    a.put(s.charAt(i),split_string[i]);
                }
            }
            
            return true;
    }
}
