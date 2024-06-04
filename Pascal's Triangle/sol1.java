class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        int element=1;
        for(int row=1;row<=numRows;row++){
            List<Integer> temp=new ArrayList<>();
            for(int col=1;col<=row;col++){
                long res=1;
                for(int i=0;i<col-1;i++){
                    res=res*(row-1-i);
                    res=res/(i+1);
                }
                temp.add((int)res);
            }
            ans.add(temp);
        }
        return ans;
    }
}
