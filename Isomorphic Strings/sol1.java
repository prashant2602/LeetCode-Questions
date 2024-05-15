class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        int len = s.length();
        int i=0;
        int count=0;
        while(i<len){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else if(!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))){
                return false;
            }
            else if(map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                return false;
            }
            else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
