class Solution {
    public boolean wordPattern(String pattern, String s) {
        String details[]=s.split(" ");
        if(pattern.length()!=details.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(details[i].trim())){
                map.put(pattern.charAt(i),details[i].trim());
            }
            else if(map.containsKey(pattern.charAt(i)) && !map.containsValue(details[i].trim())){
                return false;
            }
            else if(!map.containsKey(pattern.charAt(i)) && map.containsValue(details[i].trim())){
                return false;
            }

            else{
                if(!map.get(pattern.charAt(i)).equals(details[i].trim())){
                    return false;
                }
            }  
        }
        return true;
    }
}
