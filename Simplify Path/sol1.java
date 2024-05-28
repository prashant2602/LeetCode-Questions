class Solution {
    public String simplifyPath(String path) {
        Stack<String> S = new Stack<>();
        String details[]=path.split("/");
        for(String ele : details){
            System.out.println(ele);
        }
        for (String dir : details) {
            if (dir.equals("..")) {
                if (!S.isEmpty()) {
                    S.pop();
                }
            } else if (!dir.isEmpty() && !dir.equals(".")) {

                S.push(dir);
            }
        }

        String ans="";
        for(String ele : S){
            if(!ele.equals("")){
                ans=ans+"/"+ele;
            }

            System.out.println(ele);
        }
        System.out.println(ans);
        if(ans.length()==0){
            return "/";
        }
        return ans;
    }
}
