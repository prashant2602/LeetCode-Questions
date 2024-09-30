class Solution {
    public int reverse(int x) {
        int num =0;
        boolean neg = true;
        if(x<0){
            neg = false;
        }
        String str = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(str).reverse();
        
        try{
            num = Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            System.out.println(e);
        }

        if(!neg){
            return -num;
        }
        return num;
    }
}
